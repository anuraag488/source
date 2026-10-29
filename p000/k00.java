package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k00 implements oe1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22786a;

    /* JADX INFO: renamed from: b */
    public b63 f22787b;

    /* JADX INFO: renamed from: c */
    public Object f22788c;

    @Override // p000.oe1
    /* JADX INFO: renamed from: a */
    public final Object mo3767a(wm0 wm0Var) {
        switch (this.f22786a) {
            case 0:
                return new d41(new BitmapDrawable(this.f22787b.f15109a.getResources(), (Bitmap) this.f22788c), false, kt0.f23414b);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) this.f22788c;
                try {
                    w30 w30Var = new w30();
                    w30Var.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = this.f22787b.f15109a;
                    return new oa4(new ka4(w30Var, null), null, kt0.f23414b);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                b63 b63Var = this.f22787b;
                Drawable bitmapDrawable = (Drawable) this.f22788c;
                Bitmap.Config[] configArr = AbstractC0707h.f20231a;
                boolean z = bitmapDrawable instanceof VectorDrawable;
                if (z) {
                    bitmapDrawable = new BitmapDrawable(b63Var.f15109a.getResources(), sj3.m10823s(bitmapDrawable, b63Var.f15110b, b63Var.f15112d, b63Var.f15113e, b63Var.f15114f));
                }
                return new d41(bitmapDrawable, z, kt0.f23414b);
        }
    }
}
