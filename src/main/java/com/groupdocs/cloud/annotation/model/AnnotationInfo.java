/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="AnnotationInfo.java">
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
import com.groupdocs.cloud.annotation.model.AnnotationReplyInfo;
import com.groupdocs.cloud.annotation.model.Point;
import com.groupdocs.cloud.annotation.model.Rectangle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Describes annotation properties
 */
@ApiModel(description = "Describes annotation properties")
public class AnnotationInfo {
  @SerializedName("guid")
  private String guid = null;

  @SerializedName("documentGuid")
  private Long documentGuid = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("creatorGuid")
  private String creatorGuid = null;

  @SerializedName("creatorName")
  private String creatorName = null;

  @SerializedName("creatorEmail")
  private String creatorEmail = null;

  @SerializedName("box")
  private Rectangle box = null;

  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  @SerializedName("annotationPosition")
  private Point annotationPosition = null;

  @SerializedName("svgPath")
  private String svgPath = null;

  /**
   * Gets or sets the annotation type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TEXT("Text"),
    
    AREA("Area"),
    
    POINT("Point"),
    
    TEXTSTRIKEOUT("TextStrikeout"),
    
    POLYLINE("Polyline"),
    
    TEXTFIELD("TextField"),
    
    WATERMARK("Watermark"),
    
    TEXTREPLACEMENT("TextReplacement"),
    
    ARROW("Arrow"),
    
    TEXTREDACTION("TextRedaction"),
    
    RESOURCESREDACTION("ResourcesRedaction"),
    
    TEXTUNDERLINE("TextUnderline"),
    
    DISTANCE("Distance"),
    
    ELLIPSE("Ellipse");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Gets or sets the annotation access
   */
  @JsonAdapter(AccessEnum.Adapter.class)
  public enum AccessEnum {
    PUBLIC("Public"),
    
    PRIVATE("Private");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessEnum fromValue(String text) {
      for (AccessEnum b : AccessEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("access")
  private AccessEnum access = null;

  @SerializedName("replies")
  private List<AnnotationReplyInfo> replies = null;

  @SerializedName("createdOn")
  private OffsetDateTime createdOn = null;

  @SerializedName("fontColor")
  private Integer fontColor = null;

  @SerializedName("penColor")
  private Integer penColor = null;

  @SerializedName("penWidth")
  private Integer penWidth = null;

  @SerializedName("penStyle")
  private Integer penStyle = null;

  @SerializedName("backgroundColor")
  private Integer backgroundColor = null;

  @SerializedName("fieldText")
  private String fieldText = null;

  @SerializedName("fontFamily")
  private String fontFamily = null;

  @SerializedName("fontSize")
  private Double fontSize = null;

  @SerializedName("opacity")
  private Double opacity = null;

  @SerializedName("angle")
  private Double angle = null;

  public AnnotationInfo guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Gets or sets the unique identifier
   * @return guid
  **/
  @ApiModelProperty(value = "Gets or sets the unique identifier")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public AnnotationInfo documentGuid(Long documentGuid) {
    this.documentGuid = documentGuid;
    return this;
  }

   /**
   * Gets or sets the document unique identifier
   * @return documentGuid
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the document unique identifier")
  public Long getDocumentGuid() {
    return documentGuid;
  }

  public void setDocumentGuid(Long documentGuid) {
    this.documentGuid = documentGuid;
  }

  public AnnotationInfo text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Gets or sets the annotation text
   * @return text
  **/
  @ApiModelProperty(value = "Gets or sets the annotation text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public AnnotationInfo creatorGuid(String creatorGuid) {
    this.creatorGuid = creatorGuid;
    return this;
  }

   /**
   * Gets or sets the creator unique identifier
   * @return creatorGuid
  **/
  @ApiModelProperty(value = "Gets or sets the creator unique identifier")
  public String getCreatorGuid() {
    return creatorGuid;
  }

  public void setCreatorGuid(String creatorGuid) {
    this.creatorGuid = creatorGuid;
  }

  public AnnotationInfo creatorName(String creatorName) {
    this.creatorName = creatorName;
    return this;
  }

   /**
   * Gets or sets the name of the creator
   * @return creatorName
  **/
  @ApiModelProperty(value = "Gets or sets the name of the creator")
  public String getCreatorName() {
    return creatorName;
  }

  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }

  public AnnotationInfo creatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
    return this;
  }

   /**
   * Gets or sets the creator&#39;s email
   * @return creatorEmail
  **/
  @ApiModelProperty(value = "Gets or sets the creator's email")
  public String getCreatorEmail() {
    return creatorEmail;
  }

  public void setCreatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
  }

  public AnnotationInfo box(Rectangle box) {
    this.box = box;
    return this;
  }

   /**
   * Gets or sets the box where annotation will be placed
   * @return box
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the box where annotation will be placed")
  public Rectangle getBox() {
    return box;
  }

  public void setBox(Rectangle box) {
    this.box = box;
  }

  public AnnotationInfo pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Gets or sets the number of page where annotation will be placed
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Gets or sets the number of page where annotation will be placed")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public AnnotationInfo annotationPosition(Point annotationPosition) {
    this.annotationPosition = annotationPosition;
    return this;
  }

   /**
   * Gets or sets the annotation position
   * @return annotationPosition
  **/
  @ApiModelProperty(value = "Gets or sets the annotation position")
  public Point getAnnotationPosition() {
    return annotationPosition;
  }

  public void setAnnotationPosition(Point annotationPosition) {
    this.annotationPosition = annotationPosition;
  }

  public AnnotationInfo svgPath(String svgPath) {
    this.svgPath = svgPath;
    return this;
  }

   /**
   * Gets or sets the annotation SVG path
   * @return svgPath
  **/
  @ApiModelProperty(value = "Gets or sets the annotation SVG path")
  public String getSvgPath() {
    return svgPath;
  }

  public void setSvgPath(String svgPath) {
    this.svgPath = svgPath;
  }

  public AnnotationInfo type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Gets or sets the annotation type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the annotation type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AnnotationInfo access(AccessEnum access) {
    this.access = access;
    return this;
  }

   /**
   * Gets or sets the annotation access
   * @return access
  **/
  @ApiModelProperty(value = "Gets or sets the annotation access")
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
  }

  public AnnotationInfo replies(List<AnnotationReplyInfo> replies) {
    this.replies = replies;
    return this;
  }

  public AnnotationInfo addRepliesItem(AnnotationReplyInfo repliesItem) {
    if (this.replies == null) {
      this.replies = new ArrayList<AnnotationReplyInfo>();
    }
    this.replies.add(repliesItem);
    return this;
  }

   /**
   * Gets or sets the array of annotation replies
   * @return replies
  **/
  @ApiModelProperty(value = "Gets or sets the array of annotation replies")
  public List<AnnotationReplyInfo> getReplies() {
    return replies;
  }

  public void setReplies(List<AnnotationReplyInfo> replies) {
    this.replies = replies;
  }

  public AnnotationInfo createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Gets or sets the annotation created on date
   * @return createdOn
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the annotation created on date")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public AnnotationInfo fontColor(Integer fontColor) {
    this.fontColor = fontColor;
    return this;
  }

   /**
   * Gets or sets the annotation&#39;s font color
   * @return fontColor
  **/
  @ApiModelProperty(value = "Gets or sets the annotation's font color")
  public Integer getFontColor() {
    return fontColor;
  }

  public void setFontColor(Integer fontColor) {
    this.fontColor = fontColor;
  }

  public AnnotationInfo penColor(Integer penColor) {
    this.penColor = penColor;
    return this;
  }

   /**
   * Gets or sets the annotation&#39;s pen color
   * @return penColor
  **/
  @ApiModelProperty(value = "Gets or sets the annotation's pen color")
  public Integer getPenColor() {
    return penColor;
  }

  public void setPenColor(Integer penColor) {
    this.penColor = penColor;
  }

  public AnnotationInfo penWidth(Integer penWidth) {
    this.penWidth = penWidth;
    return this;
  }

   /**
   * Gets or sets the annotation&#39;s pen width
   * @return penWidth
  **/
  @ApiModelProperty(value = "Gets or sets the annotation's pen width")
  public Integer getPenWidth() {
    return penWidth;
  }

  public void setPenWidth(Integer penWidth) {
    this.penWidth = penWidth;
  }

  public AnnotationInfo penStyle(Integer penStyle) {
    this.penStyle = penStyle;
    return this;
  }

   /**
   * Gets or sets the annotation&#39;s pen style
   * @return penStyle
  **/
  @ApiModelProperty(value = "Gets or sets the annotation's pen style")
  public Integer getPenStyle() {
    return penStyle;
  }

  public void setPenStyle(Integer penStyle) {
    this.penStyle = penStyle;
  }

  public AnnotationInfo backgroundColor(Integer backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Gets or sets the annotation&#39;s background color 
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "Gets or sets the annotation's background color ")
  public Integer getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Integer backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public AnnotationInfo fieldText(String fieldText) {
    this.fieldText = fieldText;
    return this;
  }

   /**
   * Gets or sets the annotation&#39;s field text
   * @return fieldText
  **/
  @ApiModelProperty(value = "Gets or sets the annotation's field text")
  public String getFieldText() {
    return fieldText;
  }

  public void setFieldText(String fieldText) {
    this.fieldText = fieldText;
  }

  public AnnotationInfo fontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

   /**
   * Gets or sets the annotation&#39;s font family
   * @return fontFamily
  **/
  @ApiModelProperty(value = "Gets or sets the annotation's font family")
  public String getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }

  public AnnotationInfo fontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Gets or sets the annotation&#39;s font size 
   * @return fontSize
  **/
  @ApiModelProperty(value = "Gets or sets the annotation's font size ")
  public Double getFontSize() {
    return fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public AnnotationInfo opacity(Double opacity) {
    this.opacity = opacity;
    return this;
  }

   /**
   * Gets or sets the annotation&#39;s opacity
   * @return opacity
  **/
  @ApiModelProperty(value = "Gets or sets the annotation's opacity")
  public Double getOpacity() {
    return opacity;
  }

  public void setOpacity(Double opacity) {
    this.opacity = opacity;
  }

  public AnnotationInfo angle(Double angle) {
    this.angle = angle;
    return this;
  }

   /**
   * Gets or sets the watermark annotation&#39;s rotation angle
   * @return angle
  **/
  @ApiModelProperty(value = "Gets or sets the watermark annotation's rotation angle")
  public Double getAngle() {
    return angle;
  }

  public void setAngle(Double angle) {
    this.angle = angle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationInfo annotationInfo = (AnnotationInfo) o;
    return Objects.equals(this.guid, annotationInfo.guid) &&
        Objects.equals(this.documentGuid, annotationInfo.documentGuid) &&
        Objects.equals(this.text, annotationInfo.text) &&
        Objects.equals(this.creatorGuid, annotationInfo.creatorGuid) &&
        Objects.equals(this.creatorName, annotationInfo.creatorName) &&
        Objects.equals(this.creatorEmail, annotationInfo.creatorEmail) &&
        Objects.equals(this.box, annotationInfo.box) &&
        Objects.equals(this.pageNumber, annotationInfo.pageNumber) &&
        Objects.equals(this.annotationPosition, annotationInfo.annotationPosition) &&
        Objects.equals(this.svgPath, annotationInfo.svgPath) &&
        Objects.equals(this.type, annotationInfo.type) &&
        Objects.equals(this.access, annotationInfo.access) &&
        Objects.equals(this.replies, annotationInfo.replies) &&
        Objects.equals(this.createdOn, annotationInfo.createdOn) &&
        Objects.equals(this.fontColor, annotationInfo.fontColor) &&
        Objects.equals(this.penColor, annotationInfo.penColor) &&
        Objects.equals(this.penWidth, annotationInfo.penWidth) &&
        Objects.equals(this.penStyle, annotationInfo.penStyle) &&
        Objects.equals(this.backgroundColor, annotationInfo.backgroundColor) &&
        Objects.equals(this.fieldText, annotationInfo.fieldText) &&
        Objects.equals(this.fontFamily, annotationInfo.fontFamily) &&
        Objects.equals(this.fontSize, annotationInfo.fontSize) &&
        Objects.equals(this.opacity, annotationInfo.opacity) &&
        Objects.equals(this.angle, annotationInfo.angle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, documentGuid, text, creatorGuid, creatorName, creatorEmail, box, pageNumber, annotationPosition, svgPath, type, access, replies, createdOn, fontColor, penColor, penWidth, penStyle, backgroundColor, fieldText, fontFamily, fontSize, opacity, angle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationInfo {\n");
    
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    documentGuid: ").append(toIndentedString(documentGuid)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    creatorGuid: ").append(toIndentedString(creatorGuid)).append("\n");
    sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
    sb.append("    creatorEmail: ").append(toIndentedString(creatorEmail)).append("\n");
    sb.append("    box: ").append(toIndentedString(box)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    annotationPosition: ").append(toIndentedString(annotationPosition)).append("\n");
    sb.append("    svgPath: ").append(toIndentedString(svgPath)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    replies: ").append(toIndentedString(replies)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    penColor: ").append(toIndentedString(penColor)).append("\n");
    sb.append("    penWidth: ").append(toIndentedString(penWidth)).append("\n");
    sb.append("    penStyle: ").append(toIndentedString(penStyle)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    fieldText: ").append(toIndentedString(fieldText)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
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

