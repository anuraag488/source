package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class j13 {

    /* JADX INFO: renamed from: a */
    public final uw2 f21953a = new uw2(new y03[16]);

    /* JADX INFO: renamed from: b */
    public final cw2 f21954b = new cw2(10);

    /* JADX INFO: renamed from: a */
    public boolean mo6992a(po2 po2Var, cf2 cf2Var, rd6 rd6Var, boolean z) {
        uw2 uw2Var = this.f21953a;
        Object[] objArr = uw2Var.f32211a;
        int i = uw2Var.f32213c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((y03) objArr[i2]).mo6992a(po2Var, cf2Var, rd6Var, z) || z2;
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public void mo6993b(rd6 rd6Var) {
        uw2 uw2Var = this.f21953a;
        int i = uw2Var.f32213c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((y03) uw2Var.f32211a[i]).f34762d.f20528b == 0) {
                uw2Var.m11672l(i);
            }
        }
    }
}
