/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Rectangle.java">
 *   Copyright (c) Aspose Pty Ltd
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

/**
 * Describes rectangle where annotation will be placed
 */
@ApiModel(description = "Describes rectangle where annotation will be placed")
public class Rectangle {
  @SerializedName("X")
  private Double X = null;

  @SerializedName("Y")
  private Double Y = null;

  @SerializedName("width")
  private Double width = null;

  @SerializedName("height")
  private Double height = null;

  public Rectangle X(Double X) {
    this.X = X;
    return this;
  }

   /**
   * Gets or sets the x coordinate of the rectangle upper left corner
   * @return X
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the x coordinate of the rectangle upper left corner")
  public Double getX() {
    return X;
  }

  public void setX(Double X) {
    this.X = X;
  }

  public Rectangle Y(Double Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Gets or sets the y coordinate of the rectangle upper left corner
   * @return Y
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the y coordinate of the rectangle upper left corner")
  public Double getY() {
    return Y;
  }

  public void setY(Double Y) {
    this.Y = Y;
  }

  public Rectangle width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets the rectangle width
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the rectangle width")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Rectangle height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets the rectangle height
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the rectangle height")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return Objects.equals(this.X, rectangle.X) &&
        Objects.equals(this.Y, rectangle.Y) &&
        Objects.equals(this.width, rectangle.width) &&
        Objects.equals(this.height, rectangle.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rectangle {\n");
    
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

