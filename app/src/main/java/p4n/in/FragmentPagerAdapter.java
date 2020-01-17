package p4n.in;

import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {

	private ArrayList<Integer> itemData;

	public FragmentPagerAdapter(FragmentManager fm,
								ArrayList<Integer> itemData) {
		super(fm);
		this.itemData = itemData;
	}

	@Override
	public int getCount() {
		return itemData.size();
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		super.destroyItem(container, position, object);
	}

	@Override
	public Fragment getItem(int position) {
		FragmentImageView f = FragmentImageView.newInstance();
		f.setImageList(itemData.get(position));
		return f;
	}
}