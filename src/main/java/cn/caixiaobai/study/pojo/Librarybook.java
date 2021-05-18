package cn.caixiaobai.study.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 蔡序强
 * @since 2021-05-18
 */
public class Librarybook implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "BarCode", type = IdType.ID_WORKER)
    private String BarCode;

    @TableField("ISBN")
    private String isbn;

    @TableField("BookName")
    private String BookName;

    @TableField("Editor")
    private String Editor;

    @TableField("Publisher")
    private String Publisher;

    @TableField("IndexMarks")
    private String IndexMarks;

    @TableField("Quantity")
    private Integer Quantity;

    @TableField("Price")
    private Double Price;

    @TableField("TypeCode")
    private String TypeCode;

    @TableField("TypeName")
    private String TypeName;

    @TableField("Other")
    private String Other;

    @TableField("LawInfo")
    private String LawInfo;

    @TableField("Mode")
    private String Mode;

    @TableField("StockDate")
    private Date StockDate;

    @TableField("StockMan")
    private String StockMan;

    private String status;

    @TableField("PublishDate")
    private String PublishDate;

    public String getBarCode() {
        return BarCode;
    }

    public void setBarCode(String BarCode) {
        this.BarCode = BarCode;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }
    public String getEditor() {
        return Editor;
    }

    public void setEditor(String Editor) {
        this.Editor = Editor;
    }
    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }
    public String getIndexMarks() {
        return IndexMarks;
    }

    public void setIndexMarks(String IndexMarks) {
        this.IndexMarks = IndexMarks;
    }
    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }
    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }
    public String getTypeCode() {
        return TypeCode;
    }

    public void setTypeCode(String TypeCode) {
        this.TypeCode = TypeCode;
    }
    public String getTypeName() {
        return TypeName;
    }

    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }
    public String getOther() {
        return Other;
    }

    public void setOther(String Other) {
        this.Other = Other;
    }
    public String getLawInfo() {
        return LawInfo;
    }

    public void setLawInfo(String LawInfo) {
        this.LawInfo = LawInfo;
    }
    public String getMode() {
        return Mode;
    }

    public void setMode(String Mode) {
        this.Mode = Mode;
    }
    public Date getStockDate() {
        return StockDate;
    }

    public void setStockDate(Date StockDate) {
        this.StockDate = StockDate;
    }
    public String getStockMan() {
        return StockMan;
    }

    public void setStockMan(String StockMan) {
        this.StockMan = StockMan;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    @Override
    public String toString() {
        return "Librarybook{" +
        "BarCode=" + BarCode +
        ", isbn=" + isbn +
        ", BookName=" + BookName +
        ", Editor=" + Editor +
        ", Publisher=" + Publisher +
        ", IndexMarks=" + IndexMarks +
        ", Quantity=" + Quantity +
        ", Price=" + Price +
        ", TypeCode=" + TypeCode +
        ", TypeName=" + TypeName +
        ", Other=" + Other +
        ", LawInfo=" + LawInfo +
        ", Mode=" + Mode +
        ", StockDate=" + StockDate +
        ", StockMan=" + StockMan +
        ", status=" + status +
        ", PublishDate=" + PublishDate +
        "}";
    }
}
