package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b30 {

    /* JADX INFO: renamed from: a */
    public uw2 f15048a;

    /* JADX INFO: renamed from: a */
    public yg2 m3420a(int i, int i2) {
        yg2 yg2Var = new yg2();
        yg2Var.f35211a = i;
        yg2Var.f35212b = i2;
        if (i < 0) {
            t32.m10968a("negative start index");
        }
        if (i2 < i) {
            t32.m10968a("end index greater than start");
        }
        VarHandle.storeStoreFence();
        this.f15048a.m11663b(yg2Var);
        return yg2Var;
    }

    /* JADX INFO: renamed from: b */
    public void m3421b(CancellationException cancellationException) {
        uw2 uw2Var = this.f15048a;
        int i = uw2Var.f32213c;
        a70[] a70VarArr = new a70[i];
        for (int i2 = 0; i2 < i; i2++) {
            a70VarArr[i2] = ((cm0) uw2Var.f32211a[i2]).f16120b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            a70VarArr[i3].mo115m(cancellationException);
        }
        if (uw2Var.f32213c == 0) {
            return;
        }
        t32.m10970c("uncancelled requests present");
    }

    /* JADX INFO: renamed from: c */
    public void m3422c() {
        uw2 uw2Var = this.f15048a;
        r52 r52VarM10660c0 = sc6.m10660c0(0, uw2Var.f32213c);
        int i = r52VarM10660c0.f27382a;
        int i2 = r52VarM10660c0.f27383b;
        if (i <= i2) {
            while (true) {
                ((cm0) uw2Var.f32211a[i]).f16120b.resumeWith(ju4.f22634a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        uw2Var.m11668g();
    }
}
