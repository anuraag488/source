package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m10 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24529a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ float f24530b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24531c;

    public /* synthetic */ m10(byte b) {
        this.f24529a = b;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c1  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        long j;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        boolean z;
        byte b = this.f24529a;
        boolean z2 = false;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                d64 d64Var = (d64) this.f24531c;
                float f = this.f24530b;
                jp3 jp3Var = (jp3) obj;
                float fM13399h = ((z73) d64Var.f16820d.f25612i).m13399h();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jp3Var.f22503o & 4294967295L));
                if (!Float.isNaN(fM13399h) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    jp3Var.m7257k(sj3.m10815k(jp3Var, f));
                    jp3Var.m7258l(sj3.m10816l(jp3Var, f));
                    jp3Var.m7262u(zp0.m13673e(0.5f, (fM13399h + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return ju4Var;
            case 1:
                zx2 zx2Var = (zx2) this.f24531c;
                float f2 = this.f24530b;
                z50 z50Var = (z50) obj;
                float fMo3580c = z50Var.mo3580c() * zx2Var.f36444b;
                yx2 yx2Var = zx2Var.f36443a;
                int iOrdinal = yx2Var.ordinal();
                if (iOrdinal == 0) {
                    j = 4294967295L;
                    jFloatToRawIntBits = 0;
                } else if (iOrdinal == 1) {
                    j = 4294967295L;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (z50Var.f35750a.mo8940d() >> 32)) - fMo3580c)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                } else {
                    if (iOrdinal != 2) {
                        C0670g.m5864c();
                        return null;
                    }
                    j = 4294967295L;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (z50Var.f35750a.mo8940d() & 4294967295L)) - fMo3580c)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
                }
                yx2 yx2Var2 = yx2.f35586c;
                o40 o40Var = z50Var.f35750a;
                if (yx2Var == yx2Var2) {
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo3580c)) & j) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (o40Var.mo8940d() >> 32)))) << 32);
                } else {
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo3580c)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (o40Var.mo8940d() & j)))) & j);
                }
                C0489bf c0489bfM4495a = AbstractC0573df.m4495a();
                if (f2 > 0.0f) {
                    int iOrdinal2 = yx2Var.ordinal();
                    if (iOrdinal2 == 0) {
                        d24.m4286A(c0489bfM4495a, fMo3580c, 0.0f, 1.0f, 1.0f, f2);
                        d24.m4286A(c0489bfM4495a, fMo3580c, Float.intBitsToFloat((int) (z50Var.f35750a.mo8940d() & j)), 1.0f, -1.0f, f2);
                    } else if (iOrdinal2 == 1) {
                        int i = (int) (jFloatToRawIntBits >> 32);
                        d24.m4286A(c0489bfM4495a, Float.intBitsToFloat(i), 0.0f, -1.0f, 1.0f, f2);
                        d24.m4286A(c0489bfM4495a, Float.intBitsToFloat(i), Float.intBitsToFloat((int) (z50Var.f35750a.mo8940d() & j)), -1.0f, -1.0f, f2);
                    } else {
                        if (iOrdinal2 != 2) {
                            C0670g.m5864c();
                            return null;
                        }
                        int i2 = (int) (jFloatToRawIntBits & j);
                        d24.m4286A(c0489bfM4495a, 0.0f, Float.intBitsToFloat(i2), 1.0f, -1.0f, f2);
                        d24.m4286A(c0489bfM4495a, Float.intBitsToFloat((int) (z50Var.f35750a.mo8940d() >> 32)), Float.intBitsToFloat(i2), -1.0f, -1.0f, f2);
                    }
                }
                eh0 eh0Var = new eh0();
                eh0Var.f18084a = jFloatToRawIntBits;
                eh0Var.f18085b = jFloatToRawIntBits2;
                eh0Var.f18086c = c0489bfM4495a;
                VarHandle.storeStoreFence();
                C1127s c1127s = new C1127s((byte) 21);
                c1127s.f29778b = eh0Var;
                VarHandle.storeStoreFence();
                return z50Var.m13338a(c1127s);
            case 2:
                float f3 = this.f24530b;
                ml3 ml3Var = (ml3) this.f24531c;
                c31 c31Var = (c31) obj;
                boolean zM13387o = z62.m13387o(c31Var.mo3221v0(), "waiting");
                if (c31Var.mo3839m() == null) {
                    z = false;
                } else {
                    d63 d63VarMo3839m = c31Var.mo3839m();
                    d31 d31Var = j31.f21983a;
                    if (d63VarMo3839m != d63.f16815b ? f3 <= 30.0f || f3 > 90.0f : f3 > 30.0f) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (ml3Var.f25002a || (zM13387o && z)) {
                    z2 = true;
                }
                ml3Var.f25002a = z2;
                return Boolean.valueOf(!z2);
            case 3:
                yp1 yp1Var = (yp1) this.f24531c;
                InterfaceC0493bj interfaceC0493bj = (InterfaceC0493bj) obj;
                return new km0(((km0) yp1Var.invoke(interfaceC0493bj)).f23228a, ((km0) yp1Var.invoke(interfaceC0493bj)).f23229b, this.f24530b, null);
            case 4:
                float f4 = this.f24530b;
                ma0 ma0Var = (ma0) this.f24531c;
                bh3 bh3Var = new bh3(((Number) sc6.m10678s(Float.valueOf(f4), ma0Var)).floatValue(), ma0Var);
                ic2[] ic2VarArr = o14.f26289a;
                p14 p14Var = m14.f24554c;
                ic2 ic2Var = o14.f26289a[1];
                p14Var.getClass();
                ((q14) obj).mo4898a(p14Var, bh3Var);
                return ju4Var;
            default:
                dp4 dp4Var = (dp4) this.f24531c;
                float f5 = this.f24530b;
                long jLongValue = ((Long) obj).longValue();
                boolean zM4648j = dp4Var.m4648j();
                b83 b83Var = dp4Var.f17265h;
                if (!zM4648j) {
                    if (b83Var.m3512h() == Long.MIN_VALUE) {
                        b83Var.m3513i(jLongValue);
                        ((d83) dp4Var.f17258a.f36084a).setValue(Boolean.TRUE);
                    }
                    long jM3512h = jLongValue - b83Var.m3512h();
                    if (f5 != 0.0f) {
                        jM3512h = qq2.m10011F(jM3512h / ((double) f5));
                    }
                    dp4Var.m4655q(jM3512h);
                    dp4Var.m4649k(jM3512h, f5 == 0.0f);
                }
                return ju4Var;
        }
    }
}
