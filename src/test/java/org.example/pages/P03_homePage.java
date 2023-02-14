package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homePage {
    public P03_homePage(){
        PageFactory.initElements(Hooks.driver,this);}
    @FindBy(id = "customerCurrency")
    public WebElement currencyList;

    @FindBy(css = "span.price.actual-price")
    public List<WebElement> productPrices;
    @FindBy(xpath = "//div[@class='header-logo']/a")
    public WebElement homePageLink;
    @FindBy(xpath = "//a[@class='ico-wishlist']")
    public WebElement wishListLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/a")
    public WebElement computersLink;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[2]/a")
    public WebElement notebooksLink;

    @FindBy(id = "small-searchterms")
    public WebElement searchField;
    @FindBy(css = "button.button-1.search-box-button")
    public WebElement searchBtn;
    @FindBy(xpath = "//div[@class='nivoSlider']/a[1]")
    public WebElement nokiaImgLink;
    @FindBy(xpath = "//div[@class='nivo-controlNav']/a[2]")
    public WebElement iphoneSelector;
    @FindBy(xpath = "//div[@class='nivoSlider']/a[2]")
    public WebElement iphoneImgLink;
    @FindBy(css = "li.facebook")
    public WebElement facebookIcon;
    @FindBy(css = "li.twitter")
    public WebElement twitterIcon;
    @FindBy(css = "li.rss")
    public WebElement rssIcon;
    @FindBy(css = "li.youtube")
    public WebElement youtubeIcon;
    @FindBy(xpath = "(//div[@class='buttons'])[3]/button[3]")
    public WebElement htcPhoneAddToWishlistBtn;
    @FindBy(css = "div.bar-notification.success")
    public WebElement successNotification;
    @FindBy(css = "div.sku")
    public WebElement productSku;
    @FindBy(css = "div.product-item")
    public List<WebElement> products;
    @FindBy(css = "strong.current-item")
    public WebElement notebooksBreadCrumb;
    @FindBy(xpath = "//div[@class='page-title']/h1")
    public WebElement pageTitleHeader;
    @FindBy(css = "input.qty-input")
    public WebElement productQuantity;





}
