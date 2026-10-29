package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: jp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0806jp implements ti1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22475a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ti1 f22476b;

    public /* synthetic */ C0806jp(byte b) {
        this.f22475a = b;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0148  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) throws Throwable {
        C0770ip c0770ip;
        ml0 ml0Var;
        ut0 ut0Var;
        vj1 vj1Var;
        my2 my2Var;
        z24 z24Var;
        byte b = this.f22475a;
        ju4 ju4Var = ju4.f22634a;
        g74 g74Var = null;
        switch (b) {
            case 0:
                if (wm0Var instanceof C0770ip) {
                    c0770ip = (C0770ip) wm0Var;
                    int i = c0770ip.f21611u;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0770ip.f21611u = i - Integer.MIN_VALUE;
                    } else {
                        c0770ip = new C0770ip(this, wm0Var);
                    }
                } else {
                    c0770ip = new C0770ip(this, wm0Var);
                }
                Object obj2 = c0770ip.f21610t;
                ap0 ap0Var = ap0.f14763a;
                int i2 = c0770ip.f21611u;
                if (i2 != 0) {
                    if (i2 == 1) {
                        k43.m7376J(obj2);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj2);
                ti1 ti1Var = this.f22476b;
                long j = ((h74) obj).f20418a;
                qs5 qs5VarM3808c = pz0.f28103l;
                if (j == 9205357640488583168L) {
                    g74Var = g74.f19639c;
                } else {
                    sk3 sk3Var = fw4.f19357b;
                    if (h74.m6273e(j) >= 0.5d && h74.m6271c(j) >= 0.5d) {
                        float fM6273e = h74.m6273e(j);
                        qs5 qs5VarM3808c2 = (Float.isInfinite(fM6273e) || Float.isNaN(fM6273e)) ? qs5VarM3808c : c20.m3808c(qq2.m10010E(h74.m6273e(j)));
                        float fM6271c = h74.m6271c(j);
                        if (!Float.isInfinite(fM6271c) && !Float.isNaN(fM6271c)) {
                            qs5VarM3808c = c20.m3808c(qq2.m10010E(h74.m6271c(j)));
                        }
                        g74Var = new g74(qs5VarM3808c2, qs5VarM3808c);
                    }
                }
                if (g74Var == null) {
                    return ju4Var;
                }
                c0770ip.f21611u = 1;
                return ti1Var.emit(g74Var, c0770ip) == ap0Var ? ap0Var : ju4Var;
            case 1:
                if (wm0Var instanceof ml0) {
                    ml0Var = (ml0) wm0Var;
                    int i3 = ml0Var.f24994u;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ml0Var.f24994u = i3 - Integer.MIN_VALUE;
                    } else {
                        ml0Var = new ml0(this, wm0Var);
                    }
                } else {
                    ml0Var = new ml0(this, wm0Var);
                }
                Object obj3 = ml0Var.f24993t;
                ap0 ap0Var2 = ap0.f14763a;
                int i4 = ml0Var.f24994u;
                if (i4 != 0) {
                    if (i4 == 1) {
                        k43.m7376J(obj3);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj3);
                ti1 ti1Var2 = this.f22476b;
                long j2 = ((kl0) obj).f23210a;
                sk3 sk3Var2 = fw4.f19357b;
                qs5 qs5VarM3808c3 = pz0.f28103l;
                int i5 = (int) (3 & j2);
                int i6 = (((i5 & 2) >> 1) * 3) + ((i5 & 1) << 1);
                if (!(((((int) (j2 >> 33)) & ((1 << (i6 + 13)) - 1)) - 1 == 0) | ((((1 << (18 - i6)) - 1) & ((int) (j2 >> (i6 + 46)))) - 1 == 0))) {
                    qs5 qs5VarM3808c4 = kl0.m7535e(j2) ? c20.m3808c(kl0.m7539i(j2)) : qs5VarM3808c3;
                    if (kl0.m7534d(j2)) {
                        qs5VarM3808c3 = c20.m3808c(kl0.m7538h(j2));
                    }
                    g74Var = new g74(qs5VarM3808c4, qs5VarM3808c3);
                }
                if (g74Var == null) {
                    return ju4Var;
                }
                ml0Var.f24994u = 1;
                return ti1Var2.emit(g74Var, ml0Var) == ap0Var2 ? ap0Var2 : ju4Var;
            case 2:
                if (wm0Var instanceof ut0) {
                    ut0Var = (ut0) wm0Var;
                    int i7 = ut0Var.f32152u;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ut0Var.f32152u = i7 - Integer.MIN_VALUE;
                    } else {
                        ut0Var = new ut0(this, wm0Var);
                    }
                } else {
                    ut0Var = new ut0(this, wm0Var);
                }
                Object obj4 = ut0Var.f32151t;
                ap0 ap0Var3 = ap0.f14763a;
                int i8 = ut0Var.f32152u;
                if (i8 == 0) {
                    k43.m7376J(obj4);
                    ti1 ti1Var3 = this.f22476b;
                    wb4 wb4Var = (wb4) obj;
                    if (wb4Var instanceof tj3) {
                        throw ((tj3) wb4Var).f31196b;
                    }
                    if (wb4Var instanceof at0) {
                        Object obj5 = ((at0) wb4Var).f14852b;
                        ut0Var.f32152u = 1;
                        return ti1Var3.emit(obj5, ut0Var) == ap0Var3 ? ap0Var3 : ju4Var;
                    }
                    if ((wb4Var instanceof yf1) || (wb4Var instanceof wt4) || (wb4Var instanceof x03)) {
                        C1077qn.m9989o("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else {
                        C0670g.m5864c();
                    }
                } else {
                    if (i8 == 1) {
                        k43.m7376J(obj4);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 3:
                if (wm0Var instanceof vj1) {
                    vj1Var = (vj1) wm0Var;
                    int i9 = vj1Var.f32666u;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        vj1Var.f32666u = i9 - Integer.MIN_VALUE;
                    } else {
                        vj1Var = new vj1(this, wm0Var);
                    }
                } else {
                    vj1Var = new vj1(this, wm0Var);
                }
                Object obj6 = vj1Var.f32665t;
                ap0 ap0Var4 = ap0.f14763a;
                int i10 = vj1Var.f32666u;
                if (i10 != 0) {
                    if (i10 == 1) {
                        k43.m7376J(obj6);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj6);
                ti1 ti1Var4 = this.f22476b;
                if (obj == null) {
                    return ju4Var;
                }
                vj1Var.f32666u = 1;
                return ti1Var4.emit(obj, vj1Var) == ap0Var4 ? ap0Var4 : ju4Var;
            case 4:
                if (wm0Var instanceof my2) {
                    my2Var = (my2) wm0Var;
                    int i11 = my2Var.f25294u;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        my2Var.f25294u = i11 - Integer.MIN_VALUE;
                    } else {
                        my2Var = new my2(this, wm0Var);
                    }
                } else {
                    my2Var = new my2(this, wm0Var);
                }
                Object obj7 = my2Var.f25293t;
                ap0 ap0Var5 = ap0.f14763a;
                int i12 = my2Var.f25294u;
                if (i12 != 0) {
                    if (i12 == 1) {
                        k43.m7376J(obj7);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj7);
                ti1 ti1Var5 = this.f22476b;
                if (((Boolean) obj).booleanValue()) {
                    return ju4Var;
                }
                my2Var.f25294u = 1;
                return ti1Var5.emit(obj, my2Var) == ap0Var5 ? ap0Var5 : ju4Var;
            default:
                if (wm0Var instanceof z24) {
                    z24Var = (z24) wm0Var;
                    int i13 = z24Var.f35724u;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        z24Var.f35724u = i13 - Integer.MIN_VALUE;
                    } else {
                        z24Var = new z24(this, wm0Var);
                    }
                } else {
                    z24Var = new z24(this, wm0Var);
                }
                Object obj8 = z24Var.f35723t;
                ap0 ap0Var6 = ap0.f14763a;
                int i14 = z24Var.f35724u;
                if (i14 != 0) {
                    if (i14 == 1) {
                        k43.m7376J(obj8);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj8);
                ti1 ti1Var6 = this.f22476b;
                String str = (String) ((hw2) obj).m6525c(y70.f34988s);
                ih1 ih1Var = new ih1();
                ih1Var.f21418a = str;
                VarHandle.storeStoreFence();
                z24Var.f35724u = 1;
                return ti1Var6.emit(ih1Var, z24Var) == ap0Var6 ? ap0Var6 : ju4Var;
        }
    }
}
