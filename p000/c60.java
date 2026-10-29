package p000;

import android.graphics.Bitmap;
import java.io.EOFException;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c60 {

    /* JADX INFO: renamed from: a */
    public final pg2 f15828a;

    /* JADX INFO: renamed from: b */
    public final pg2 f15829b;

    /* JADX INFO: renamed from: c */
    public final long f15830c;

    /* JADX INFO: renamed from: d */
    public final long f15831d;

    /* JADX INFO: renamed from: e */
    public final boolean f15832e;

    /* JADX INFO: renamed from: f */
    public final uv1 f15833f;

    public c60(ak3 ak3Var) throws EOFException {
        aj2 aj2Var = aj2.f14537b;
        b60 b60Var = new b60((byte) 0);
        b60Var.f15101b = this;
        VarHandle.storeStoreFence();
        this.f15828a = i25.m6630z(aj2Var, b60Var);
        b60 b60Var2 = new b60(true ? 1 : 0);
        b60Var2.f15101b = this;
        VarHandle.storeStoreFence();
        this.f15829b = i25.m6630z(aj2Var, b60Var2);
        this.f15830c = Long.parseLong(ak3Var.mo3040y(Long.MAX_VALUE));
        this.f15831d = Long.parseLong(ak3Var.mo3040y(Long.MAX_VALUE));
        this.f15832e = Integer.parseInt(ak3Var.mo3040y(Long.MAX_VALUE)) > 0;
        int i = Integer.parseInt(ak3Var.mo3040y(Long.MAX_VALUE));
        tv1 tv1Var = new tv1((byte) 0);
        for (int i2 = 0; i2 < i; i2++) {
            String strMo3040y = ak3Var.mo3040y(Long.MAX_VALUE);
            Bitmap.Config[] configArr = AbstractC0707h.f20231a;
            int iM6342h0 = hd4.m6342h0(strMo3040y, ':', 0, 6);
            if (iM6342h0 == -1) {
                C1077qn.m9988n("Unexpected header: ".concat(strMo3040y));
                throw null;
            }
            tv1Var.m11166b(hd4.m6360z0(strMo3040y.substring(0, iM6342h0)).toString(), strMo3040y.substring(iM6342h0 + 1));
        }
        this.f15833f = tv1Var.m11167c();
    }

    /* JADX INFO: renamed from: a */
    public final void m3852a(yj3 yj3Var) {
        yj3Var.m13148b(this.f15830c);
        yj3Var.writeByte(10);
        yj3Var.m13148b(this.f15831d);
        yj3Var.writeByte(10);
        yj3Var.m13148b(this.f15832e ? 1L : 0L);
        yj3Var.writeByte(10);
        uv1 uv1Var = this.f15833f;
        yj3Var.m13148b(uv1Var.size());
        yj3Var.writeByte(10);
        int size = uv1Var.size();
        for (int i = 0; i < size; i++) {
            yj3Var.mo6998F(uv1Var.m11658b(i));
            yj3Var.mo6998F(": ");
            yj3Var.mo6998F(uv1Var.m11660d(i));
            yj3Var.writeByte(10);
        }
    }

    public c60(xo3 xo3Var) {
        aj2 aj2Var = aj2.f14537b;
        b60 b60Var = new b60(0 == true ? 1 : 0);
        b60Var.f15101b = this;
        VarHandle.storeStoreFence();
        this.f15828a = i25.m6630z(aj2Var, b60Var);
        b60 b60Var2 = new b60((byte) 1);
        b60Var2.f15101b = this;
        VarHandle.storeStoreFence();
        this.f15829b = i25.m6630z(aj2Var, b60Var2);
        this.f15830c = xo3Var.f34504k;
        this.f15831d = xo3Var.f34505l;
        this.f15832e = xo3Var.f34498e != null;
        this.f15833f = xo3Var.f34499f;
    }
}
