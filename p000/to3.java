package p000;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class to3 {

    /* JADX INFO: renamed from: d */
    public static to3 f31288d;

    /* JADX INFO: renamed from: a */
    public WeakHashMap f31289a;

    /* JADX INFO: renamed from: b */
    public TypedValue f31290b;

    /* JADX INFO: renamed from: c */
    public boolean f31291c;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        new so3(6);
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m11077a(Context context, int i) {
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        TypedValue typedValue = this.f31290b;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.f31290b = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            po2 po2Var = (po2) this.f31289a.get(context);
            if (po2Var != null && (weakReference = (WeakReference) po2Var.m9590a(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    po2Var.m9593d(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m11078b(Context context, int i) {
        return m11079c(context, i);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Drawable m11079c(Context context, int i) {
        Drawable drawableM11077a;
        try {
            if (!this.f31291c) {
                this.f31291c = true;
                Drawable drawableM11078b = m11078b(context, C0995R.drawable.abc_vector_test);
                if (drawableM11078b == null || !"android.graphics.drawable.VectorDrawable".equals(drawableM11078b.getClass().getName())) {
                    this.f31291c = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableM11077a = m11077a(context, i);
            if (drawableM11077a == null) {
                drawableM11077a = context.getDrawable(i);
            }
            if (drawableM11077a != null) {
                synchronized (this) {
                }
            }
            if (drawableM11077a != null) {
                int i2 = e41.f17682a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableM11077a;
    }
}
