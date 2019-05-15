/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="RowInfo.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes text row information
 */
@ApiModel(description = "Describes text row information")
public class RowInfo {
  @SerializedName("characterCoordinates")
  private List<Double> characterCoordinates = null;

  @SerializedName("lineHeight")
  private Double lineHeight = null;

  @SerializedName("lineLeft")
  private Double lineLeft = null;

  @SerializedName("lineTop")
  private Double lineTop = null;

  @SerializedName("lineWidth")
  private Double lineWidth = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("textCoordinates")
  private List<Double> textCoordinates = null;

  public RowInfo characterCoordinates(List<Double> characterCoordinates) {
    this.characterCoordinates = characterCoordinates;
    return this;
  }

  public RowInfo addCharacterCoordinatesItem(Double characterCoordinatesItem) {
    if (this.characterCoordinates == null) {
      this.characterCoordinates = new ArrayList<Double>();
    }
    this.characterCoordinates.add(characterCoordinatesItem);
    return this;
  }

   /**
   * Gets or sets the list of character coordinates
   * @return characterCoordinates
  **/
  @ApiModelProperty(value = "Gets or sets the list of character coordinates")
  public List<Double> getCharacterCoordinates() {
    return characterCoordinates;
  }

  public void setCharacterCoordinates(List<Double> characterCoordinates) {
    this.characterCoordinates = characterCoordinates;
  }

  public RowInfo lineHeight(Double lineHeight) {
    this.lineHeight = lineHeight;
    return this;
  }

   /**
   * Gets or sets the text line height
   * @return lineHeight
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the text line height")
  public Double getLineHeight() {
    return lineHeight;
  }

  public void setLineHeight(Double lineHeight) {
    this.lineHeight = lineHeight;
  }

  public RowInfo lineLeft(Double lineLeft) {
    this.lineLeft = lineLeft;
    return this;
  }

   /**
   * Gets or sets the x coordinate of the text line upper left corner
   * @return lineLeft
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the x coordinate of the text line upper left corner")
  public Double getLineLeft() {
    return lineLeft;
  }

  public void setLineLeft(Double lineLeft) {
    this.lineLeft = lineLeft;
  }

  public RowInfo lineTop(Double lineTop) {
    this.lineTop = lineTop;
    return this;
  }

   /**
   * Gets or sets the y coordinate of the text line upper left corner
   * @return lineTop
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the y coordinate of the text line upper left corner")
  public Double getLineTop() {
    return lineTop;
  }

  public void setLineTop(Double lineTop) {
    this.lineTop = lineTop;
  }

  public RowInfo lineWidth(Double lineWidth) {
    this.lineWidth = lineWidth;
    return this;
  }

   /**
   * Gets or sets the text line width
   * @return lineWidth
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the text line width")
  public Double getLineWidth() {
    return lineWidth;
  }

  public void setLineWidth(Double lineWidth) {
    this.lineWidth = lineWidth;
  }

  public RowInfo text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Gets or sets the text
   * @return text
  **/
  @ApiModelProperty(value = "Gets or sets the text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public RowInfo textCoordinates(List<Double> textCoordinates) {
    this.textCoordinates = textCoordinates;
    return this;
  }

  public RowInfo addTextCoordinatesItem(Double textCoordinatesItem) {
    if (this.textCoordinates == null) {
      this.textCoordinates = new ArrayList<Double>();
    }
    this.textCoordinates.add(textCoordinatesItem);
    return this;
  }

   /**
   * Gets or sets the list of text coordinates
   * @return textCoordinates
  **/
  @ApiModelProperty(value = "Gets or sets the list of text coordinates")
  public List<Double> getTextCoordinates() {
    return textCoordinates;
  }

  public void setTextCoordinates(List<Double> textCoordinates) {
    this.textCoordinates = textCoordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowInfo rowInfo = (RowInfo) o;
    return Objects.equals(this.characterCoordinates, rowInfo.characterCoordinates) &&
        Objects.equals(this.lineHeight, rowInfo.lineHeight) &&
        Objects.equals(this.lineLeft, rowInfo.lineLeft) &&
        Objects.equals(this.lineTop, rowInfo.lineTop) &&
        Objects.equals(this.lineWidth, rowInfo.lineWidth) &&
        Objects.equals(this.text, rowInfo.text) &&
        Objects.equals(this.textCoordinates, rowInfo.textCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterCoordinates, lineHeight, lineLeft, lineTop, lineWidth, text, textCoordinates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowInfo {\n");
    
    sb.append("    characterCoordinates: ").append(toIndentedString(characterCoordinates)).append("\n");
    sb.append("    lineHeight: ").append(toIndentedString(lineHeight)).append("\n");
    sb.append("    lineLeft: ").append(toIndentedString(lineLeft)).append("\n");
    sb.append("    lineTop: ").append(toIndentedString(lineTop)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    textCoordinates: ").append(toIndentedString(textCoordinates)).append("\n");
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

