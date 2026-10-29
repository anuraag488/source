package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sk2 extends jy4 {

    /* JADX INFO: renamed from: b */
    public final lv2 f30353b;

    public sk2() {
        lv2 lv2Var = n52.f25469a;
        this.f30353b = new lv2();
    }

    @Override // p000.jy4
    /* JADX INFO: renamed from: b */
    public final void mo5324b() {
        lv2 lv2Var = this.f30353b;
        int[] iArr = lv2Var.f24666b;
        Object[] objArr = lv2Var.f24667c;
        long[] jArr = lv2Var.f24665a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        cw2 cw2Var = (cw2) objArr[i4];
                        Object[] objArr2 = cw2Var.f16532a;
                        int i6 = cw2Var.f16533b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            rk2 rk2Var = (rk2) objArr2[i7];
                            d70 d70Var = rk2Var.f29373d;
                            if (d70Var != null) {
                                d70Var.cancel();
                            }
                            rk2Var.f29373d = null;
                            s92 s92Var = (s92) rk2Var.f29370a.f33090b;
                            s92Var.f30010c = true;
                            s92Var.f30009b = false;
                            s92Var.m10564a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
