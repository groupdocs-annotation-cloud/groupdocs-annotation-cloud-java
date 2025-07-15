/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 * Copyright (c) Aspose Pty Ltd
 * </copyright>
 * <summary>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */
package com.groupdocs.cloud.annotation.api;

import java.util.ArrayList;

public class TestFiles
{

    // Cells
    public static TestFile OnePageCells = new TestFile("one-page.xlsx", "cells\\");
    public static TestFile OnePagePasswordCells = new TestFile("one-page-password.xlsx", "cells\\");
    public static TestFile TenPagesCells = new TestFile("ten-pages.xlsx", "cells\\");

    // Diagram
    public static TestFile OnePageDiagram = new TestFile("one-page.vsd", "diagram\\");
    public static TestFile TenPagesDiagram = new TestFile("ten-pages.vsd", "diagram\\");

    // Email
    public static TestFile OnePageEmail = new TestFile("one-page.emlx", "email\\");

    // Html
    public static TestFile OnePageHtml = new TestFile("one-page.html", "html\\");

    // Images
    public static TestFile OnePageBmp = new TestFile("one-page.bmp", "images\\");
    public static TestFile OnePagePng = new TestFile("one-page.png", "images\\");

    // Pdf
    public static TestFile OnePagePdf = new TestFile("one-page.pdf", "pdf\\");
    public static TestFile OnePagePasswordPdf = new TestFile("one-page-password.pdf", "pdf\\");
    public static TestFile TenPagesPdf = new TestFile("ten-pages.pdf", "pdf\\");

    // Slides
    public static TestFile OnePageSlides = new TestFile("one-page.pptx", "slides\\");
    public static TestFile OnePagePasswordSlides = new TestFile("one-page-password.pptx", "slides\\");
    public static TestFile TenPagesSlides = new TestFile("ten-pages.pptx", "slides\\");

    // Words
    public static TestFile OnePageWords = new TestFile("one-page.docx", "words\\");
    public static TestFile OnePagePasswordWords = new TestFile("one-page-password.docx", "words\\");
    public static TestFile TenPagesWords = new TestFile("ten-pages.docx", "words\\");

    // With annotations
    public static TestFile InputWords = new TestFile("input.docx", "input\\");
    public static TestFile InputCells = new TestFile("input.xlsx", "input\\");
    public static TestFile InputEmail = new TestFile("input.eml", "input\\");
    public static TestFile InputHtml = new TestFile("input.html", "input\\");
    public static TestFile InputPdf = new TestFile("input.pdf", "input\\");
    public static TestFile InputImage = new TestFile("input.png", "input\\");
    public static TestFile InputPresentation = new TestFile("input.pptx", "input\\");
    public static TestFile InputDiagram = new TestFile("input.vsdx", "input\\");


    public static ArrayList<TestFile> TestFilesList()
    {
        ArrayList<TestFile> files = new ArrayList<>();
        files.add(OnePageCells);
        files.add(OnePagePasswordCells);
        files.add(TenPagesCells);
        files.add(OnePageDiagram);
        files.add(TenPagesDiagram);
        files.add(OnePageEmail);
        files.add(OnePageHtml);
        files.add(OnePageBmp);
        files.add(OnePagePng);
        files.add(OnePagePdf);
        files.add(OnePagePasswordPdf);
        files.add(TenPagesPdf);
        files.add(OnePageSlides);
        files.add(OnePagePasswordSlides);
        files.add(TenPagesSlides);
        files.add(OnePageWords);
        files.add(OnePagePasswordWords);
        files.add(TenPagesWords);
        files.add(InputWords);
        files.add(InputCells);
        files.add(InputEmail);
        files.add(InputHtml);
        files.add(InputPdf);
        files.add(InputImage);
        files.add(InputPresentation);
        files.add(InputDiagram);        
        return files;
    }
}
