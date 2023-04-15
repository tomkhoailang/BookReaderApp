/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.item;

import controller.panel.ReadingController;
import views.items.ChapterItem;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import models.ChapterModel;
import models.DAO.ChapterDAO;
import models.DAO.ReadingDAO;
import models.entityPK.ReadingPK;
import views.panels.BookEditPanel;
import views.panels.ReadingPanel;
import views.MainView;

/**
 *
 * @author ADMIN
 */
public class ChapterItemController {

    private ChapterItem chapterItem;
    private MainView mainView;

    public ChapterItemController(JPanel parent, ChapterItem chapterItem, MainView mainView) {
        this.chapterItem = chapterItem;
        this.mainView = mainView;
        this.chapterItem.setPreferredSize(this.chapterItem.getPreferredSize());

        if (!(parent instanceof BookEditPanel)) {
            this.chapterItem.getBtnDelete().setVisible(false);
        }
        this.chapterItem.onBtnDeleteClick(e -> {
            DeleteThisChapter();
        });

        this.chapterItem.onLbChapterClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    ReadingPanel chapterDetails = new ReadingPanel();
                    ChapterModel currentChapter  = chapterItem.getChapterModels();
                    ReadingController reading = new ReadingController(chapterDetails, mainView, currentChapter);
                    reading.setChapterDetails(currentChapter);
                    ReadingDAO.getInstance().readingEvent(new ReadingPK(mainView.getUserModels().getId(), currentChapter.getId()));
                    getMainView().setMainPanel(chapterDetails);

                } catch (Exception es) {
                    System.out.println("Khong co mainView");
                }
            }

        });
    }

    public void DeleteThisChapter() {
        JPanel parent = (JPanel) this.chapterItem.getParent();
        parent.remove(this.chapterItem);
        parent.setPreferredSize(new Dimension(0, parent.getComponentCount() * 40));
        parent.revalidate();
        parent.repaint();
    }

    public ChapterItem getChapterItem() {
        return chapterItem;
    }

    public void setChapterItem(ChapterItem chapterItem) {
        this.chapterItem = chapterItem;
    }

    public MainView getMainView() {
        return mainView;
    }

    public void setMainView(MainView mainView) {
        this.mainView = mainView;
    }

}
