/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PreviewOptions.java">
 *   Copyright (c) 2003-2021 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.annotation.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.annotation.model.FileInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents options for GetPages API method
 */
@ApiModel(description = "Represents options for GetPages API method")
public class PreviewOptions {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  /**
   * Preview format. Supported values are: PNG, JPEG or BMP. Default value is PNG.
   */
  @JsonAdapter(FormatEnum.Adapter.class)
  public enum FormatEnum {
    PNG("PNG"),
    
    JPEG("JPEG"),
    
    BMP("BMP");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String text) {
      for (FormatEnum b : FormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("format")
  private FormatEnum format = null;

  @SerializedName("pageNumbers")
  private List<Integer> pageNumbers = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("renderComments")
  private Boolean renderComments = null;

  public PreviewOptions fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * Input document description
   * @return fileInfo
  **/
  @ApiModelProperty(value = "Input document description")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public PreviewOptions format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Preview format. Supported values are: PNG, JPEG or BMP. Default value is PNG.
   * @return format
  **/
  @ApiModelProperty(required = true, value = "Preview format. Supported values are: PNG, JPEG or BMP. Default value is PNG.")
  public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public PreviewOptions pageNumbers(List<Integer> pageNumbers) {
    this.pageNumbers = pageNumbers;
    return this;
  }

  public PreviewOptions addPageNumbersItem(Integer pageNumbersItem) {
    if (this.pageNumbers == null) {
      this.pageNumbers = new ArrayList<Integer>();
    }
    this.pageNumbers.add(pageNumbersItem);
    return this;
  }

   /**
   * Page numbers to preview. All pages proceeded if not specified.
   * @return pageNumbers
  **/
  @ApiModelProperty(value = "Page numbers to preview. All pages proceeded if not specified.")
  public List<Integer> getPageNumbers() {
    return pageNumbers;
  }

  public void setPageNumbers(List<Integer> pageNumbers) {
    this.pageNumbers = pageNumbers;
  }

  public PreviewOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Preview image width. Not required. Default width used if not specified or 0.
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Preview image width. Not required. Default width used if not specified or 0.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PreviewOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Preview image height. Not required. Default width used if not specified or 0.
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Preview image height. Not required. Default width used if not specified or 0.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PreviewOptions renderComments(Boolean renderComments) {
    this.renderComments = renderComments;
    return this;
  }

   /**
   * Render document comments. Default value is &#39;false&#39;.
   * @return renderComments
  **/
  @ApiModelProperty(required = true, value = "Render document comments. Default value is 'false'.")
  public Boolean getRenderComments() {
    return renderComments;
  }

  public void setRenderComments(Boolean renderComments) {
    this.renderComments = renderComments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewOptions previewOptions = (PreviewOptions) o;
    return Objects.equals(this.fileInfo, previewOptions.fileInfo) &&
        Objects.equals(this.format, previewOptions.format) &&
        Objects.equals(this.pageNumbers, previewOptions.pageNumbers) &&
        Objects.equals(this.width, previewOptions.width) &&
        Objects.equals(this.height, previewOptions.height) &&
        Objects.equals(this.renderComments, previewOptions.renderComments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, format, pageNumbers, width, height, renderComments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewOptions {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    pageNumbers: ").append(toIndentedString(pageNumbers)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    renderComments: ").append(toIndentedString(renderComments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

