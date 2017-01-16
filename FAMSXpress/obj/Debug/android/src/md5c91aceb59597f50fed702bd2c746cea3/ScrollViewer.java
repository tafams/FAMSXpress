package md5c91aceb59597f50fed702bd2c746cea3;


public class ScrollViewer
	extends android.widget.FrameLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getTopFadingEdgeStrength:()F:GetGetTopFadingEdgeStrengthHandler\n" +
			"n_getBottomFadingEdgeStrength:()F:GetGetBottomFadingEdgeStrengthHandler\n" +
			"n_getLeftFadingEdgeStrength:()F:GetGetLeftFadingEdgeStrengthHandler\n" +
			"n_getRightFadingEdgeStrength:()F:GetGetRightFadingEdgeStrengthHandler\n" +
			"n_addView:(Landroid/view/View;)V:GetAddView_Landroid_view_View_Handler\n" +
			"n_onSizeChanged:(IIII)V:GetOnSizeChanged_IIIIHandler\n" +
			"n_computeVerticalScrollRange:()I:GetComputeVerticalScrollRangeHandler\n" +
			"n_computeVerticalScrollOffset:()I:GetComputeVerticalScrollOffsetHandler\n" +
			"n_computeHorizontalScrollOffset:()I:GetComputeHorizontalScrollOffsetHandler\n" +
			"n_computeHorizontalScrollRange:()I:GetComputeHorizontalScrollRangeHandler\n" +
			"n_measureChild:(Landroid/view/View;II)V:GetMeasureChild_Landroid_view_View_IIHandler\n" +
			"n_measureChildWithMargins:(Landroid/view/View;IIII)V:GetMeasureChildWithMargins_Landroid_view_View_IIIIHandler\n" +
			"n_onScrollChanged:(IIII)V:GetOnScrollChanged_IIIIHandler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_computeScroll:()V:GetComputeScrollHandler\n" +
			"n_scrollTo:(II)V:GetScrollTo_IIHandler\n" +
			"n_onOverScrolled:(IIZZ)V:GetOnOverScrolled_IIZZHandler\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.SfDataGrid.ScrollViewer, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", ScrollViewer.class, __md_methods);
	}


	public ScrollViewer (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == ScrollViewer.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.ScrollViewer, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public ScrollViewer (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == ScrollViewer.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.ScrollViewer, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public ScrollViewer (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == ScrollViewer.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.ScrollViewer, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public ScrollViewer (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) throws java.lang.Throwable
	{
		super (p0, p1, p2, p3);
		if (getClass () == ScrollViewer.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.ScrollViewer, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public float getTopFadingEdgeStrength ()
	{
		return n_getTopFadingEdgeStrength ();
	}

	private native float n_getTopFadingEdgeStrength ();


	public float getBottomFadingEdgeStrength ()
	{
		return n_getBottomFadingEdgeStrength ();
	}

	private native float n_getBottomFadingEdgeStrength ();


	public float getLeftFadingEdgeStrength ()
	{
		return n_getLeftFadingEdgeStrength ();
	}

	private native float n_getLeftFadingEdgeStrength ();


	public float getRightFadingEdgeStrength ()
	{
		return n_getRightFadingEdgeStrength ();
	}

	private native float n_getRightFadingEdgeStrength ();


	public void addView (android.view.View p0)
	{
		n_addView (p0);
	}

	private native void n_addView (android.view.View p0);


	public void onSizeChanged (int p0, int p1, int p2, int p3)
	{
		n_onSizeChanged (p0, p1, p2, p3);
	}

	private native void n_onSizeChanged (int p0, int p1, int p2, int p3);


	public int computeVerticalScrollRange ()
	{
		return n_computeVerticalScrollRange ();
	}

	private native int n_computeVerticalScrollRange ();


	public int computeVerticalScrollOffset ()
	{
		return n_computeVerticalScrollOffset ();
	}

	private native int n_computeVerticalScrollOffset ();


	public int computeHorizontalScrollOffset ()
	{
		return n_computeHorizontalScrollOffset ();
	}

	private native int n_computeHorizontalScrollOffset ();


	public int computeHorizontalScrollRange ()
	{
		return n_computeHorizontalScrollRange ();
	}

	private native int n_computeHorizontalScrollRange ();


	public void measureChild (android.view.View p0, int p1, int p2)
	{
		n_measureChild (p0, p1, p2);
	}

	private native void n_measureChild (android.view.View p0, int p1, int p2);


	public void measureChildWithMargins (android.view.View p0, int p1, int p2, int p3, int p4)
	{
		n_measureChildWithMargins (p0, p1, p2, p3, p4);
	}

	private native void n_measureChildWithMargins (android.view.View p0, int p1, int p2, int p3, int p4);


	public void onScrollChanged (int p0, int p1, int p2, int p3)
	{
		n_onScrollChanged (p0, p1, p2, p3);
	}

	private native void n_onScrollChanged (int p0, int p1, int p2, int p3);


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);


	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);


	public boolean onInterceptTouchEvent (android.view.MotionEvent p0)
	{
		return n_onInterceptTouchEvent (p0);
	}

	private native boolean n_onInterceptTouchEvent (android.view.MotionEvent p0);


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public void computeScroll ()
	{
		n_computeScroll ();
	}

	private native void n_computeScroll ();


	public void scrollTo (int p0, int p1)
	{
		n_scrollTo (p0, p1);
	}

	private native void n_scrollTo (int p0, int p1);


	public void onOverScrolled (int p0, int p1, boolean p2, boolean p3)
	{
		n_onOverScrolled (p0, p1, p2, p3);
	}

	private native void n_onOverScrolled (int p0, int p1, boolean p2, boolean p3);

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
