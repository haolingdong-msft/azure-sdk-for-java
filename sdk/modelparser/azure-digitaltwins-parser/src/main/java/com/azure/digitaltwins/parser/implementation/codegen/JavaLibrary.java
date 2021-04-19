// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.parser.implementation.codegen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Generator for a java library of code files.
 */
public class JavaLibrary {
    private static final String FILE_EXTENSION = ".java";
    private final String outputDirectory;
    private final String libraryNamespace;

    private final List<String> systemNamespaces;
    private final List<String> otherNamespaces;
    private final List<JavaFile> javaFiles;

    /**
     * Initializes a new instance of the {@link JavaLibrary} class.
     *
     * @param outputDirectory  Path to directory in which to create generated code files.
     * @param libraryNamespace Namespace for the library.
     */
    public JavaLibrary(String outputDirectory, String libraryNamespace) {
        this.outputDirectory = outputDirectory;
        this.libraryNamespace = libraryNamespace;

        this.systemNamespaces = new ArrayList<>();
        this.otherNamespaces = new ArrayList<>();
        this.javaFiles = new ArrayList<>();
    }

    /**
     * Add an import statement to all code files.
     *
     * @param namespaceToImport The namespace for the "import" declaration.
     */
    public void addImportStatement(String namespaceToImport) {
        if (namespaceToImport.toLowerCase(Locale.getDefault()).startsWith("java")) {
            this.systemNamespaces.add(namespaceToImport);
        } else {
            this.otherNamespaces.add(namespaceToImport);
        }
    }

    /**
     * Add a java interface to the library.
     *
     * @param access    Access level of the interface.
     * @param typeName  The name of the interface being declared.
     * @param extend    Types that the interface is extending from.
     * @param implement Interfaces that the interface is implementing.
     * @return The {@link JavaInterface} object added itself.
     */
    public JavaInterface addInterface(Access access, String typeName, String extend, String implement) {
        JavaInterface javaInterface = new JavaInterface(access, typeName, extend, implement);
        this.javaFiles.add(javaInterface);
        return javaInterface;
    }

    /**
     * Add a java class to the library.
     *
     * @param access       Access level of the class.
     * @param novelty      Novelty of the class.
     * @param typeName     The name of the class being declared.
     * @param multiplicity Static or Instance.
     * @param extend       Base classes that the class inherits from.
     * @param implement    Interfaces that the class implements.
     * @return The {@link JavaClass} object added itself.
     */
    public JavaClass addClass(Access access, Novelty novelty, String typeName, Multiplicity multiplicity, String extend, String implement) {
        JavaClass javaClass = new JavaClass(access, novelty, typeName, multiplicity, extend, implement);
        this.javaFiles.add(javaClass);
        return javaClass;
    }

    /**
     * Add a java enum to the library.
     *
     * @param access   Access level of the class.
     * @param typeName The name of the enum being declared.
     * @param isSorted True if the enum values should be sorted by name.
     * @return The {@link JavaClass} object added itself.
     */
    public JavaEnum addEnum(Access access, String typeName, boolean isSorted) {
        JavaEnum javaEnum = new JavaEnum(access, typeName, isSorted);
        this.javaFiles.add(javaEnum);
        return javaEnum;
    }

    /**
     * Generates code for the library.
     *
     * @return A list of generated file names.
     * @throws IOException IOException
     */
    public List<String> generate() throws IOException {
        List<String> filePaths = new ArrayList<>();
        for (JavaFile javaFile : this.javaFiles) {
            String fileName = javaFile.getTypeName() + FILE_EXTENSION;
            String filePath = this.outputDirectory + fileName;
            CodeWriter codeWriter = new CodeWriter(filePath);

            codeWriter.writeLine(
                "// Copyright (c) Microsoft Corporation. All rights reserved.\n"
                    + "// Licensed under the MIT License.\n"
                    + "// Code generated by Microsoft (R) Code Generator");

            codeWriter.addNewLine();

            codeWriter.writeLine("package " + this.libraryNamespace);

            codeWriter.addNewLine();

            for (String importStatement : this.systemNamespaces) {
                codeWriter.writeLine("import " + importStatement);
            }

            for (String importStatement : this.otherNamespaces) {
                codeWriter.writeLine("import " + importStatement);
            }

            codeWriter.addNewLine();

            javaFile.generateCode(codeWriter);

            codeWriter.close();
            filePaths.add(filePath);
        }

        return filePaths;
    }
}
