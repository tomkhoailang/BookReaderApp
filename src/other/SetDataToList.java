/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package other;

import controller.item.BookItemController;
import controller.item.BookItemManagerController;
import controller.item.ChapterItemController;
import controller.item.CommentItemController;
import controller.item.UserItemController;
import java.util.ArrayList;
import models.BookModel;
import models.CategoryModel;
import models.UserModel;
import views.items.BookItem;
import views.items.BookItemManager;
import views.items.CategoryItem;
import views.items.ChapterItem;
import views.items.CommentItem;
import views.items.UserItemManager;
import javax.swing.JPanel;
import models.ChapterModel;
import models.ReviewModel;
import models.SavedModel;
import views.panels.UserManagingPanel;
import views.MainView;

/**
 *
 * @author ADMIN
 */
public class SetDataToList {
    private MainView mainView;
    private ArrayList<BookModel> bookList;
    private ArrayList<UserModel> userList;
    private ArrayList<CategoryModel> categoryList;
    private ArrayList<ChapterModel> chapterList;
    private ArrayList<ReviewModel> reviewList;
    private ArrayList<SavedModel> saveList;
    
    public SetDataToList(MainView mainView) {
        this.mainView = mainView;
    }

//    public SetDataToList(ArrayList<BookModels> bookList, ArrayList<UserModels> userList, ArrayList<CategoryModels> categoryList) {
//        this.bookList = bookList;
//        this.userList = userList;
//        this.categoryList = categoryList;
//    }

    //tạo ví dụ để nhìn, làm xong xóa đống bùi nhùi này
    public void setBookItemList(JPanel panel) {
        ArrayList<BookItem> items = new ArrayList<>();

        for(int i=0;i<17;i++){
            BookItem a = new BookItem(new BookModel(i, "a", "a", null, "a", 1));
            new BookItemController(a,this.mainView);
            items.add(a);
            
            
        }
        
        for (BookItem i:items) {
            panel.add(i);
        }
        panel.revalidate();
        panel.repaint();
    }
    
    public void setMainViewItemList(JPanel panel) {
        ArrayList<BookItem> items = new ArrayList<>();

        for(int i=0;i<5;i++){
            BookItem a = new BookItem(new BookModel(i, "a", "a", null, "a", 1));
            new BookItemController(a,this.mainView);
            items.add(a);
            
            
        }
        
        for (BookItem i:items) {
            panel.add(i);
        }
        panel.revalidate();
        panel.repaint();
    }
    
    public void setBookManagerList(JPanel panel) {
        ArrayList<BookItemManager> items = new ArrayList<>();

        for(int i=0;i<40;i++){
            BookItemManager a = new BookItemManager(new BookModel(i, "a", "a", null, "a", 1));
            new BookItemManagerController(a,this.mainView);
            items.add(a);
            
            
        }
        
        for (BookItemManager i:items) {
            panel.add(i);
        }
        panel.revalidate();
        panel.repaint();
    }
    
    public void setUserItemList(JPanel panel) {
        ArrayList<UserItemManager> items = new ArrayList<>();

        for(int i=0;i<40;i++){
            UserItemManager a = new UserItemManager(new UserModel(i, "a", "a", "123456789", null, false, 1));
            new UserItemController(a, mainView);
            items.add(a);
            
        }
        
        for (UserItemManager i:items) {
            panel.add(i);
        }
        panel.revalidate();
        panel.repaint();
    }
    //
    public void setChapterList(JPanel parent, JPanel panel, int book_id) {
        ArrayList<ChapterItem> items = new ArrayList<>();

        for(int i=0;i<20;i++){
            ChapterItem a = new ChapterItem(new ChapterModel(i, "a", (i+1),"123456789", 1));
            new ChapterItemController(parent, a, mainView);
//            new BookItemController(a,this.mainView);
            items.add(a);
            
        }
        
        for (ChapterItem i:items) {
            panel.add(i);
        }
        panel.revalidate();
        panel.repaint();
    }
    
    public void setCommentList(JPanel parent, JPanel panel, int book_id) {
        ArrayList<CommentItem> items = new ArrayList<>();

        for(int i=0;i<20;i++){
            CommentItem a = new CommentItem(new ReviewModel(i, book_id, "this is a comeent", 1));
            new CommentItemController(parent, a, mainView);
            items.add(a);
            
        }
        
        for (CommentItem i:items) {
            panel.add(i);
        }
        panel.revalidate();
        panel.repaint();
    }
    
//    //Tạo list book cho người đọc
//    public void setBookItemList(JPanel panel) {
//        try {
//            ArrayList<BookItem> items = new ArrayList<>();
//            for (BookModels i:this.bookList) {
//                BookItem item = new BookItem(i);
//                new BookItemController(item, mainView);
//                items.add(item);
//            }
//            for (BookItem i:items) {
//                panel.add(i);
//            }
//        } catch (Exception e) {
//            panel.add(new JLabel("Danh sach trong"));
//        }
//        panel.revalidate();
//        panel.repaint();
//    }
//    
//    //tạo list book cho mainView (truyền vào max 5 cuốn)
//    public void setMainViewItemList(JPanel panel) {
//        try {
//            ArrayList<BookItem> items = new ArrayList<>();
//            for (BookModels i:this.bookList) {
//                BookItem item = new BookItem(i);
//                new BookItemController(item, mainView);
//                items.add(item);
//            }
//            for (BookItem i:items) {
//                panel.add(i);
//            }
//        } catch (Exception e) {
//            panel.add(new JLabel("Danh sach trong"));
//        }
//        panel.revalidate();
//        panel.repaint();
//    }
//    
//    //tạo list thông tin book cho người quản lý
//    public void setBookManagerList(JPanel panel) {
//        try {
//            ArrayList<BookItemManager> items = new ArrayList<>();
//            for (BookModels i:this.bookList) {
//                BookItemManager item = new BookItemManager(i);
//                new BookItemManagerController(item, mainView);
//                items.add(item);
//            }
//            for (BookItemManager i:items) {
//                panel.add(i);
//            }
//        } catch (Exception e) {
//            panel.add(new JLabel("Danh sach trong"));
//        }
//        panel.revalidate();
//        panel.repaint();
//    }
//    
//    //tạo list thông tin user
//    public void setUserItemList(JPanel panel) {
//        try {
//            ArrayList<UserItemManager> items = new ArrayList<>();
//            for (UserModels i:this.userList) {
//                UserItemManager item = new UserItemManager(i);
//                new UserItemController(item,mainView);
//                items.add(item);
//            }
//            for (UserItemManager i:items) {
//                panel.add(i);
//            }
//        } catch (Exception e) {
//            panel.add(new JLabel("Danh sach trong"));
//        }
//        panel.revalidate();
//        panel.repaint();
//    }
//    
//    //tạo list chapter
//    public void setChapterList(JPanel panel, int book_id) {
//        try {
//            ArrayList<ChapterItem> items = new ArrayList<>();
//            for (ChapterModels i:this.chapterList) {
//                if(i.getBook_id() == book_id){
//                    ChapterItem item = new ChapterItem(i);
//                    new ChapterItemController(item, mainView);
//                    items.add(new ChapterItem(i));
//                }
//            }
//            for (ChapterItem i:items) {
//                panel.add(i);
//            }
//        } catch (Exception e) {
//            panel.add(new JLabel("Danh sach trong"));
//        }
//        panel.revalidate();
//        panel.repaint();
//    }
//
//
//    //tạo list comments của sách
//    public void setCommentList(JPanel panel, int book_id) {
//        ArrayList<CommentItem> items = new ArrayList<>();
//
//        for(ReviewModels i:reviewList){
//            if(i.getBook_id() == book_id){
//                CommentItem a = new CommentItem(i);
//                new CommentItemController(a, mainView);
//                items.add(a);
//            } 
//        }
//        
//        for (CommentItem i:items) {
//            panel.add(i);
//        }
//        
//        panel.revalidate();
//        panel.repaint();
//    }
    
    public MainView getMainView() {
        return mainView;
    }

    public void setMainView(MainView mainView) {
        this.mainView = mainView;
    }

    public ArrayList<BookModel> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<BookModel> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<UserModel> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<UserModel> userList) {
        this.userList = userList;
    }

    public ArrayList<CategoryModel> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<CategoryModel> categoryList) {
        this.categoryList = categoryList;
    }

    public ArrayList<ChapterModel> getChapterList() {
        return chapterList;
    }

    public void setChapterList(ArrayList<ChapterModel> chapterList) {
        this.chapterList = chapterList;
    }

    public ArrayList<ReviewModel> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<ReviewModel> reviewList) {
        this.reviewList = reviewList;
    }
    
    
    
}
