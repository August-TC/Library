package RelatedObjects;

import java.util.ArrayList;
import java.util.List;

public class BorrowedItemList
{
    private List<BorrowedItem> borrowedItems;
    private static BorrowedItemList ourInstance = new BorrowedItemList();

    public static BorrowedItemList getInstance()
    {
        return ourInstance;
    }

    private BorrowedItemList()
    {
        borrowedItems = new ArrayList<>();
    }

    public List<BorrowedItem> getBorrowedBooks()
    {
        return borrowedItems;
    }

    public void addBorrowedBook(BorrowedItem borrowedItem)
    {
        borrowedItems.add(borrowedItem);
    }

    public void removeBorrowedBook(BorrowedItem borrowedItem)
    {
        borrowedItems.remove(borrowedItem);
    }
}
