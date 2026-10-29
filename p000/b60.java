package p000;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b60 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15100a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ c60 f15101b;

    public /* synthetic */ b60(byte b) {
        this.f15100a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f15100a;
        c60 c60Var = this.f15101b;
        switch (b) {
            case 0:
                return vd6.m11826J(c60Var.f15833f);
            default:
                String strM11657a = c60Var.f15833f.m11657a("Content-Type");
                if (strM11657a == null) {
                    return null;
                }
                Pattern pattern = qr2.f28726c;
                try {
                    return qq2.m10034r(strM11657a);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }
}
