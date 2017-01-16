package md5d50938888551eb106ca3708e7fa5cf44;


public class PagerHorizontalScrollView
	extends android.widget.HorizontalScrollView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onScrollChanged:(IIII)V:GetOnScrollChanged_IIIIHandler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.SfDataGrid.DataPager.PagerHorizontalScrollView, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", PagerHorizontalScrollView.class, __md_methods);
	}


	public PagerHorizontalScrollView (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == PagerHorizontalScrollView.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.DataPager.PagerHorizontalScrollView, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public PagerHorizontalScrollView (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == PagerHorizontalScrollView.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.DataPager.PagerHorizontalScrollView, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public PagerHorizontalScrollView (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == PagerHorizontalScrollView.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.DataPager.PagerHorizontalScrollView, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public PagerHorizontalScrollView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) throws java.lang.Throwable
	{
		super (p0, p1, p2, p3);
		if (getClass () == PagerHorizontalScrollView.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.DataPager.PagerHorizontalScrollView, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public void onScrollChanged (int p0, int p1, int p2, int p3)
	{
		n_onScrollChanged (p0, p1, p2, p3);
	}

	private native void n_onScrollChanged (int p0, int p1, int p2, int p3);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
