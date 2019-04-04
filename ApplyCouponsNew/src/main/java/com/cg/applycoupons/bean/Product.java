package com.cg.applycoupons.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product
{
	@Id
	@Column(name="prodid",length=10)
	private long prodId;
	@Column(name="name",length=70)
	private String name;
	@Column(name="sizer",length=5)
	private String size;
	@Column(name="quantity",length=5)	
	private int quantity;
	@Column(name="rating",length=5)
	private double rating;
	
	@ManyToOne
	@JoinColumn(name="merId")
	private Merchant merchant;
	
	@Column(name="price",length=6)
	private double price;
	@Column(name="prodCategory",length=50)
	private String prodCategory;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="productImg")
	private List<Image> prodImages;
	@Column(name="discount",length=5)
	private double prodDiscount;
	@ManyToMany(mappedBy = "prod_coupon")
	/*@JoinTable(name = "prod_coupans", joinColumns = { @JoinColumn(name = "prodid") }, inverseJoinColumns = {
	@JoinColumn(name = "couponId") })*/
	private List<Coupon> prodCoupon;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Feedback> prodFeedback;
	
	@ManyToMany(mappedBy = "products")
	/*@JoinTable(name = "prod_wishList", joinColumns = { @JoinColumn(name = "prodid") }, inverseJoinColumns = {
	@JoinColumn(name = "wishid") })*/
	private List<WishList> wishlist;
	
	@ManyToMany(mappedBy = "products")
	/*@JoinTable(name = "prod_ordList", joinColumns = { @JoinColumn(name = "prodid") }, inverseJoinColumns = {
	@JoinColumn(name = "orderId") })*/
	private List<Orders> myorders;
	
	public Product() 
	{
		super();
	}
	
	public Product(long prodId, String name, String size, int quantity, double rating, Merchant merchant, double price,
			String prodCategory, List<Image> prodImages, double prodDiscount, List<Coupon> prodCoupon,
			List<Feedback> prodFeedback, List<WishList> wishlist, List<Orders> myorders) {
		super();
		this.prodId = prodId;
		this.name = name;
		this.size = size;
		this.quantity = quantity;
		this.rating = rating;
		this.merchant = merchant;
		this.price = price;
		this.prodCategory = prodCategory;
		this.prodImages = prodImages;
		this.prodDiscount = prodDiscount;
		this.prodCoupon = prodCoupon;
		this.prodFeedback = prodFeedback;
		this.wishlist = wishlist;
		this.myorders = myorders;
	}
	public long getProdId() {
		return prodId;
	}
	public void setProdId(long prodId) {
		this.prodId = prodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public List<Image> getProdImages() {
		return prodImages;
	}
	public void setProdImages(List<Image> prodImages) {
		this.prodImages = prodImages;
	}
	public double getProdDiscount() {
		return prodDiscount;
	}
	public void setProdDiscount(double prodDiscount) {
		this.prodDiscount = prodDiscount;
	}
	public List<Coupon> getProdCoupon() {
		return prodCoupon;
	}
	public void setProdCoupon(List<Coupon> prodCoupon) {
		this.prodCoupon = prodCoupon;
	}
	public List<Feedback> getProdFeedback() {
		return prodFeedback;
	}
	public void setProdFeedback(List<Feedback> prodFeedback) {
		this.prodFeedback = prodFeedback;
	}
	public List<WishList> getWishlist() {
		return wishlist;
	}
	public void setWishlist(List<WishList> wishlist) {
		this.wishlist = wishlist;
	}
	public List<Orders> getMyorders() {
		return myorders;
	}
	public void setMyorders(List<Orders> myorders) {
		this.myorders = myorders;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", name=" + name + ", size=" + size + ", quantity=" + quantity
				+ ", rating=" + rating + ", merchant=" + merchant + ", price=" + price + ", prodCategory="
				+ prodCategory + ", prodImages=" + prodImages + ", prodDiscount=" + prodDiscount + ", prodCoupon="
				+ prodCoupon + ", prodFeedback=" + prodFeedback + ", wishlist=" + wishlist + ", myorders=" + myorders
				+ "]";
	}
	
	
	 
}
