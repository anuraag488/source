package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ka3 extends ia3 {

    /* JADX INFO: renamed from: d */
    public final ja3 f23024d;

    /* JADX INFO: renamed from: e */
    public Object f23025e;

    /* JADX INFO: renamed from: f */
    public boolean f23026f;

    /* JADX INFO: renamed from: g */
    public int f23027g;

    public ka3(ja3 ja3Var, aq4[] aq4VarArr) {
        super(ja3Var.f22135c, aq4VarArr);
        this.f23024d = ja3Var;
        this.f23027g = ja3Var.f22137e;
    }

    /* JADX INFO: renamed from: c */
    public final void m7467c(int i, zp4 zp4Var, Object obj, int i2) {
        int i3 = i2 * 5;
        aq4[] aq4VarArr = this.f21202a;
        if (i3 <= 30) {
            int iM5356f0 = 1 << ev0.m5356f0(i, i3);
            if (zp4Var.m13704h(iM5356f0)) {
                aq4VarArr[i2].m3115a(zp4Var.f36256d, Integer.bitCount(zp4Var.f36253a) * 2, zp4Var.m13702f(iM5356f0));
                this.f21203b = i2;
                return;
            } else {
                int iM13715t = zp4Var.m13715t(iM5356f0);
                zp4 zp4VarM13714s = zp4Var.m13714s(iM13715t);
                aq4VarArr[i2].m3115a(zp4Var.f36256d, Integer.bitCount(zp4Var.f36253a) * 2, iM13715t);
                m7467c(i, zp4VarM13714s, obj, i2 + 1);
                return;
            }
        }
        aq4 aq4Var = aq4VarArr[i2];
        Object[] objArr = zp4Var.f36256d;
        aq4Var.m3115a(objArr, objArr.length, 0);
        while (true) {
            aq4 aq4Var2 = aq4VarArr[i2];
            if (z62.m13387o(aq4Var2.f14778a[aq4Var2.f14780c], obj)) {
                this.f21203b = i2;
                return;
            } else {
                aq4VarArr[i2].f14780c += 2;
            }
        }
    }

    @Override // p000.ia3, java.util.Iterator
    public final Object next() {
        if (this.f23024d.f22137e != this.f23027g) {
            C1077qn.m9983c();
            return null;
        }
        if (!this.f21204c) {
            xy4.m12795x();
            return null;
        }
        aq4 aq4Var = this.f21202a[this.f21203b];
        this.f23025e = aq4Var.f14778a[aq4Var.f14780c];
        this.f23026f = true;
        return super.next();
    }

    @Override // p000.ia3, java.util.Iterator
    public final void remove() {
        if (!this.f23026f) {
            xy4.m12787p();
            return;
        }
        boolean z = this.f21204c;
        ja3 ja3Var = this.f23024d;
        if (!z) {
            as4.m3256o(ja3Var).remove(this.f23025e);
        } else {
            if (!z) {
                xy4.m12795x();
                return;
            }
            aq4 aq4Var = this.f21202a[this.f21203b];
            Object obj = aq4Var.f14778a[aq4Var.f14780c];
            as4.m3256o(ja3Var).remove(this.f23025e);
            m7467c(obj != null ? obj.hashCode() : 0, ja3Var.f22135c, obj, 0);
        }
        this.f23025e = null;
        this.f23026f = false;
        this.f23027g = ja3Var.f22137e;
    }
}
