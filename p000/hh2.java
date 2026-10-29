package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hh2 {

    /* JADX INFO: renamed from: a */
    public fh2[] f20575a;

    /* JADX INFO: renamed from: b */
    public kl0 f20576b;

    /* JADX INFO: renamed from: c */
    public int f20577c;

    /* JADX INFO: renamed from: d */
    public int f20578d;

    /* JADX INFO: renamed from: e */
    public int f20579e;

    /* JADX INFO: renamed from: f */
    public int f20580f;

    /* JADX INFO: renamed from: g */
    public int f20581g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ jh2 f20582h;

    /* JADX INFO: renamed from: b */
    public static void m6397b(hh2 hh2Var, ni2 ni2Var, zo0 zo0Var, au1 au1Var, int i, int i2, boolean z) {
        hh2Var.f20582h.getClass();
        long jM8776c = ni2Var.m8776c(0);
        hh2Var.m6398a(ni2Var, zo0Var, au1Var, i, i2, (int) (!z ? jM8776c & 4294967295L : jM8776c >> 32));
    }

    /* JADX INFO: renamed from: a */
    public final void m6398a(ni2 ni2Var, zo0 zo0Var, au1 au1Var, int i, int i2, int i3) {
        fh2[] fh2VarArr;
        List list = ni2Var.f25847b;
        fh2[] fh2VarArr2 = this.f20575a;
        int length = fh2VarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f20580f = i;
                this.f20581g = i2;
                break;
            } else {
                fh2 fh2Var = fh2VarArr2[i4];
                if (fh2Var != null && fh2Var.f18988g) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int size = list.size();
        int length2 = this.f20575a.length;
        while (true) {
            fh2VarArr = this.f20575a;
            if (size >= length2) {
                break;
            }
            fh2 fh2Var2 = fh2VarArr[size];
            if (fh2Var2 != null) {
                fh2Var2.m5712c();
            }
            size++;
        }
        if (fh2VarArr.length != list.size()) {
            this.f20575a = (fh2[]) Arrays.copyOf(this.f20575a, list.size());
        }
        this.f20576b = kl0.m7531a(ni2Var.f25858m);
        this.f20577c = i3;
        this.f20578d = 0;
        this.f20579e = 1;
        int size2 = list.size();
        jh2 jh2Var = this.f20582h;
        for (int i5 = 0; i5 < size2; i5++) {
            Object objMo4423m = ((db3) list.get(i5)).mo4423m();
            xg2 xg2Var = objMo4423m instanceof xg2 ? (xg2) objMo4423m : null;
            fh2[] fh2VarArr3 = this.f20575a;
            if (xg2Var == null) {
                fh2 fh2Var3 = fh2VarArr3[i5];
                if (fh2Var3 != null) {
                    fh2Var3.m5712c();
                }
                this.f20575a[i5] = null;
            } else {
                fh2 fh2Var4 = fh2VarArr3[i5];
                if (fh2Var4 == null) {
                    g32 g32Var = new g32((byte) 5);
                    g32Var.f19558b = jh2Var;
                    VarHandle.storeStoreFence();
                    fh2Var4 = new fh2();
                    fh2Var4.f18982a = zo0Var;
                    fh2Var4.f18983b = au1Var;
                    fh2Var4.f18984c = g32Var;
                    Boolean bool = Boolean.FALSE;
                    fh2Var4.f18989h = k43.m7398w(bool);
                    fh2Var4.f18990i = k43.m7398w(bool);
                    fh2Var4.f18991j = k43.m7398w(bool);
                    fh2Var4.f18992k = k43.m7398w(bool);
                    fh2Var4.f18993l = 9223372034707292159L;
                    fh2Var4.f18994m = 0L;
                    fh2Var4.f18995n = 9223372034707292159L;
                    fh2Var4.f18996o = au1Var != null ? au1Var.mo3312b() : null;
                    fh2Var4.f18997p = new C0910mi(o52.m8954a(0L), sw4.f30618g, null, 12);
                    fh2Var4.f18998q = new C0910mi(Float.valueOf(1.0f), sw4.f30612a, null, 12);
                    fh2Var4.f18999r = k43.m7398w(o52.m8954a(0L));
                    VarHandle.storeStoreFence();
                    this.f20575a[i5] = fh2Var4;
                }
                fh2Var4.f18985d = xg2Var.f34268o;
                fh2Var4.f18986e = xg2Var.f34269p;
                fh2Var4.f18987f = xg2Var.f34270q;
            }
        }
    }
}
