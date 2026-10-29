package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fg2 implements yq2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18958a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yq2 f18959b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ jg2 f18960c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f18961d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ yq2 f18962e;

    public /* synthetic */ fg2(byte b) {
        this.f18958a = b;
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: a */
    public final Map mo4502a() {
        switch (this.f18958a) {
            case 0:
                break;
        }
        return this.f18959b.mo4502a();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091 A[LOOP:0: B:11:0x0035->B:30:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[SYNTHETIC] */
    @Override // p000.yq2
    /* JADX INFO: renamed from: b */
    public final void mo4503b() {
        switch (this.f18958a) {
            case 0:
                jg2 jg2Var = this.f18960c;
                jg2Var.f22234e = this.f18961d;
                this.f18962e.mo4503b();
                uw2 uw2Var = jg2Var.f22242m;
                lw2 lw2Var = jg2Var.f22241l;
                long[] jArr = lw2Var.f24418a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj = lw2Var.f24419b[i4];
                                    de4 de4Var = (de4) lw2Var.f24420c[i4];
                                    int iM11670j = uw2Var.m11670j(obj);
                                    if (iM11670j < 0 || iM11670j >= jg2Var.f22234e) {
                                        if (iM11670j >= 0) {
                                            Object[] objArr = uw2Var.f32211a;
                                            Object obj2 = objArr[iM11670j];
                                            objArr[iM11670j] = ae4.f14405b;
                                        }
                                        if (jg2Var.f22239j.m8127b(obj)) {
                                            de4Var.mo4491a();
                                        }
                                        lw2Var.m8137l(i4);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                jg2Var.m7094g(jg2Var.f22233d);
                break;
            default:
                jg2 jg2Var2 = this.f18960c;
                jg2Var2.f22233d = this.f18961d;
                this.f18962e.mo4503b();
                if (jg2Var2.f22230a.f33319i == null) {
                    jg2Var2.m7094g(jg2Var2.f22233d);
                }
                break;
        }
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: c */
    public final mq1 mo5704c() {
        switch (this.f18958a) {
            case 0:
                break;
        }
        return this.f18959b.mo5704c();
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: d */
    public final int mo4504d() {
        switch (this.f18958a) {
            case 0:
                break;
        }
        return this.f18959b.mo4504d();
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: e */
    public final yp1 mo4505e() {
        switch (this.f18958a) {
            case 0:
                break;
        }
        return this.f18959b.mo4505e();
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: f */
    public final yp1 mo5705f() {
        switch (this.f18958a) {
            case 0:
                break;
        }
        return this.f18959b.mo5705f();
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: g */
    public final int mo4506g() {
        switch (this.f18958a) {
            case 0:
                break;
        }
        return this.f18959b.mo4506g();
    }
}
