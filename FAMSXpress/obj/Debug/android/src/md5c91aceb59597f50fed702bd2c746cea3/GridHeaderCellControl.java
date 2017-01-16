package md5c91aceb59597f50fed702bd2c746cea3;


public class GridHeaderCellControl
	extends md5c91aceb59597f50fed702bd2c746cea3.CellElement
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener,
		android.view.View.OnLongClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onLongClick:(Landroid/view/View;)Z:GetOnLongClick_Landroid_view_View_Handler:Android.Views.View/IOnLongClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.SfDataGrid.GridHeaderCellControl, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", GridHeaderCellControl.class, __md_methods);
	}


	public GridHeaderCellControl (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == GridHeaderCellControl.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.GridHeaderCellControl, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public GridHeaderCellControl (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == GridHeaderCellControl.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.GridHeaderCellControl, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public GridHeaderCellControl (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == GridHeaderCellControl.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.GridHeaderCellControl, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public GridHeaderCellControl (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) throws java.lang.Throwable
	{
		super (p0, p1, p2, p3);
		if (getClass () == GridHeaderCellControl.class)
			mono.android.TypeManager.Activate ("Syncfusion.SfDataGrid.GridHeaderCellControl, Syncfusion.SfDataGrid.Android, Version=14.4451.0.15, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onDraw (android.graphics.Canvas p0)
	{
		n_onDraw (p0);
	}

	private native void n_onDraw (android.graphics.Canvas p0);


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);


	public boolean onLongClick (android.view.View p0)
	{
		return n_onLongClick (p0);
	}

	private native boolean n_onLongClick (android.view.View p0);

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
