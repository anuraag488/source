package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: a4 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0005a4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f86a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f87b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f88c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f89d;

    public /* synthetic */ C0005a4(byte b) {
        this.f86a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        ju4 ju4Var;
        ju4 ju4Var2;
        int i;
        boolean z;
        byte b = this.f86a;
        int i2 = 0;
        ju4 ju4Var3 = ju4.f22634a;
        switch (b) {
            case 0:
                C1354y3 c1354y3 = (C1354y3) this.f88c;
                int i3 = this.f87b;
                yp1 yp1Var = (yp1) this.f89d;
                C1391z3 c1391z3 = new C1391z3((byte) 0);
                c1391z3.f35730b = i3;
                c1391z3.f35731c = yp1Var;
                VarHandle.storeStoreFence();
                c1354y3.f34829b.add(c1391z3);
                C0562d4 c0562d4 = new C0562d4((byte) 1);
                c0562d4.f16768b = c1354y3;
                c0562d4.f16769c = c1391z3;
                VarHandle.storeStoreFence();
                return c0562d4;
            case 1:
                yk3 yk3Var = (yk3) this.f88c;
                int i4 = this.f87b;
                yv2 yv2Var = (yv2) this.f89d;
                ti0 ti0Var = (ti0) obj;
                if (yk3Var.f35301e == i4 && z62.m13387o(yv2Var, yk3Var.f35302f) && (ti0Var instanceof zi0)) {
                    long[] jArr = yv2Var.f35547a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i2;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj2 = yv2Var.f35548b[i9];
                                        boolean z2 = yv2Var.f35549c[i9] != i4;
                                        if (z2) {
                                            i = i6;
                                            zi0 zi0Var = (zi0) ti0Var;
                                            z = z2;
                                            lw2 lw2Var = zi0Var.f36117g;
                                            dt0.m4689R(lw2Var, obj2, yk3Var);
                                            ju4Var2 = ju4Var3;
                                            if (obj2 instanceof wy0) {
                                                wy0 wy0Var = (wy0) obj2;
                                                if (!lw2Var.m8128c(wy0Var)) {
                                                    dt0.m4690S(zi0Var.f36120j, wy0Var);
                                                }
                                                lw2 lw2Var2 = yk3Var.f35303g;
                                                if (lw2Var2 != null) {
                                                    lw2Var2.m8136k(obj2);
                                                }
                                            }
                                        } else {
                                            z = z2;
                                            ju4Var2 = ju4Var3;
                                            i = i6;
                                        }
                                        if (z) {
                                            yv2Var.m13262f(i9);
                                        }
                                    } else {
                                        ju4Var2 = ju4Var3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    ju4Var3 = ju4Var2;
                                }
                                ju4Var = ju4Var3;
                                if (i7 != i6) {
                                    return ju4Var;
                                }
                            } else {
                                ju4Var = ju4Var3;
                            }
                            if (i5 == length) {
                                return ju4Var;
                            }
                            i5++;
                            ju4Var3 = ju4Var;
                            i2 = 0;
                        }
                    }
                }
                return ju4Var3;
            case 2:
                rx3 rx3Var = (rx3) this.f88c;
                int i10 = this.f87b;
                db3 db3Var = (db3) this.f89d;
                cb3 cb3Var = (cb3) obj;
                int iM132h = rx3Var.f29707o.f33828a.m132h();
                if (iM132h < 0) {
                    iM132h = 0;
                }
                if (iM132h <= i10) {
                    i10 = iM132h;
                }
                int i11 = -i10;
                boolean z3 = rx3Var.f29708p;
                int i12 = z3 ? 0 : i11;
                if (!z3) {
                    i11 = 0;
                }
                cb3Var.f15915a = true;
                cb3.m3945s(cb3Var, db3Var, i12, i11);
                cb3Var.f15915a = false;
                return ju4Var3;
            case 3:
                ((ch0) this.f88c).invoke(Integer.valueOf(this.f87b), this.f89d, (sn0) obj);
                return ju4Var3;
            case 4:
                ((ch0) this.f88c).invoke(Integer.valueOf(this.f87b), this.f89d, (sn0) obj);
                return ju4Var3;
            default:
                vx4 vx4Var = (vx4) this.f88c;
                db3 db3Var2 = (db3) this.f89d;
                int i13 = this.f87b;
                cb3 cb3Var2 = (cb3) obj;
                int i14 = vx4Var.f32912b;
                hk4 hk4Var = vx4Var.f32911a;
                uo4 uo4Var = vx4Var.f32913c;
                kl4 kl4Var = (kl4) vx4Var.f32914d.invoke();
                hk4Var.m6425a(d63.f16814a, lb5.m7905N(cb3Var2, i14, uo4Var, kl4Var != null ? kl4Var.f23216a : null, false, db3Var2.f16899a), i13, db3Var2.f16900b);
                cb3.m3944n(cb3Var2, db3Var2, 0, Math.round(-hk4Var.f20659a.m13399h()));
                return ju4Var3;
        }
    }
}
