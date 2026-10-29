package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a84 {

    /* JADX INFO: renamed from: a */
    public static final a84 f165a = new a84();

    /* JADX INFO: renamed from: b */
    public static final C0489bf f166b = AbstractC0573df.m4495a();

    /* JADX INFO: renamed from: e */
    public static void m134e(u31 u31Var, d63 d63Var, long j, long j2, long j3, float f, float f2) {
        cr3 cr3Var;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (d63Var == d63.f16814a) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            jl3 jl3VarM5672j = AbstractC0647fd.m5672j(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            cr3Var = new cr3(jl3VarM5672j.f22396a, jl3VarM5672j.f22397b, jl3VarM5672j.f22398c, jl3VarM5672j.f22399d, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            jl3 jl3VarM5672j2 = AbstractC0647fd.m5672j(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
            cr3Var = new cr3(jl3VarM5672j2.f22396a, jl3VarM5672j2.f22397b, jl3VarM5672j2.f22398c, jl3VarM5672j2.f22399d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        C0489bf c0489bf = f166b;
        C0489bf.m3559b(c0489bf, cr3Var);
        u31.m11224q(u31Var, c0489bf, j3, null, 60);
        c0489bf.m3565h();
    }

    /* JADX INFO: renamed from: a */
    public final void m135a(nv2 nv2Var, nt2 nt2Var, u74 u74Var, boolean z, long j, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-290277409);
        int i3 = (ir1Var.m6890g(nv2Var) ? 4 : 2) | i | 48 | (ir1Var.m6890g(u74Var) ? 256 : 128) | (ir1Var.m6892h(z) ? 2048 : 1024) | 8192;
        if (ir1Var.m6871T(i3 & 1, (74899 & i3) != 74898)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                tx4 tx4Var = j84.f22091a;
                j = dt0.m4704f(4.0f, 44.0f);
                i2 = i3 & (-57345);
                nt2Var = kt2.f23428a;
            } else {
                ir1Var.m6874W();
                i2 = i3 & (-57345);
            }
            ir1Var.m6913s();
            int i4 = i2 & 14;
            int i5 = i2 << 3;
            m136b(nv2Var, nt2Var, u74Var, z, j, ir1Var, (i5 & 57344) | i4 | 432 | (i5 & 7168) | 1572864);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            x74 x74Var = new x74();
            x74Var.f34044a = this;
            x74Var.f34045b = nv2Var;
            x74Var.f34046c = nt2Var;
            x74Var.f34047d = u74Var;
            x74Var.f34048e = z;
            x74Var.f34049f = j;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = x74Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m136b(nv2 nv2Var, nt2 nt2Var, u74 u74Var, boolean z, long j, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-949601789);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nv2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6892h(false) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6890g(u74Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6892h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6888f(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var.m6890g(this) ? 1048576 : 524288;
        }
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (599187 & i2) != 599186)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0 && !ir1Var.m6856B()) {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            int i3 = i2 >> 3;
            j84.m7050d(nv2Var, nt2Var, u74Var, z, j, ir1Var, (i2 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | ((i2 << 12) & 458752));
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ct1 ct1Var = new ct1(b);
            ct1Var.f16447e = this;
            ct1Var.f16448f = nv2Var;
            ct1Var.f16449g = nt2Var;
            ct1Var.f16450h = u74Var;
            ct1Var.f16444b = z;
            ct1Var.f16445c = j;
            ct1Var.f16446d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ct1Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m137c(k84 k84Var, nt2 nt2Var, boolean z, u74 u74Var, mq1 mq1Var, nq1 nq1Var, float f, float f2, mi0 mi0Var, int i) {
        int i2;
        nt2 nt2Var2;
        mq1 mq1Var2;
        nq1 nq1Var2;
        float f3;
        float f4;
        int i3;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(49984771);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(k84Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= ir1Var.m6892h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ir1Var.m6890g(u74Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = 720896 | i4;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= ir1Var.m6890g(this) ? 67108864 : 33554432;
        }
        if (ir1Var.m6871T(i5 & 1, (38347923 & i5) != 38347922)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                boolean z2 = ((((i5 & 7168) ^ 3072) > 2048 && ir1Var.m6890g(u74Var)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object objM6869O = ir1Var.m6869O();
                i50 i50Var = ki0.f23136a;
                Object obj = objM6869O;
                if (z2 || objM6869O == i50Var) {
                    C0823k5 c0823k5 = new C0823k5((byte) 7);
                    c0823k5.f22893c = u74Var;
                    c0823k5.f22892b = z;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0823k5);
                    obj = c0823k5;
                }
                mq1 mq1Var3 = (mq1) obj;
                Object objM6869O2 = ir1Var.m6869O();
                if (objM6869O2 == i50Var) {
                    objM6869O2 = h04.f20248c;
                    ir1Var.m6905n0(objM6869O2);
                }
                nq1Var2 = (nq1) objM6869O2;
                tx4 tx4Var = j84.f22091a;
                int i6 = i5 & (-33087489);
                mq1Var2 = mq1Var3;
                nt2Var2 = kt2.f23428a;
                f3 = 6.0f;
                f4 = 2.0f;
                i3 = i6;
            } else {
                ir1Var.m6874W();
                int i7 = i5 & (-33087489);
                mq1Var2 = mq1Var;
                nq1Var2 = nq1Var;
                f3 = f;
                f4 = f2;
                i3 = i7;
                nt2Var2 = nt2Var;
            }
            ir1Var.m6913s();
            int i8 = i3 << 3;
            m138d(k84Var, nt2Var2, z, u74Var, mq1Var2, nq1Var2, f3, f4, ir1Var, 805306416 | (i3 & 14) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (i8 & 3670016), ((i3 >> 21) & 112) | 6);
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
            mq1Var2 = mq1Var;
            nq1Var2 = nq1Var;
            f3 = f;
            f4 = f2;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            w74 w74Var = new w74();
            w74Var.f33137a = this;
            w74Var.f33138b = k84Var;
            w74Var.f33139c = nt2Var2;
            w74Var.f33140d = z;
            w74Var.f33141e = u74Var;
            w74Var.f33142f = mq1Var2;
            w74Var.f33143g = nq1Var2;
            w74Var.f33144h = f3;
            w74Var.f33145i = f4;
            w74Var.f33146j = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = w74Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m138d(k84 k84Var, nt2 nt2Var, boolean z, u74 u74Var, mq1 mq1Var, nq1 nq1Var, float f, float f2, mi0 mi0Var, int i, int i2) {
        int i3;
        int i4;
        float f3;
        nt2 nt2VarM8575c;
        Object obj;
        mq1 mq1Var2 = mq1Var;
        nq1 nq1Var2 = nq1Var;
        float f4 = f2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(133396521);
        if ((i & 6) == 0) {
            i3 = (ir1Var.m6894i(k84Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ir1Var.m6884d(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ir1Var.m6890g(nt2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ir1Var.m6892h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ir1Var.m6890g(u74Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ir1Var.m6894i(mq1Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ir1Var.m6894i(nq1Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= ir1Var.m6884d(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= ir1Var.m6884d(f4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= ir1Var.m6892h(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ir1Var.m6892h(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (ir1Var.m6871T(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            d63 d63Var = k84Var.f22992g;
            long jM11271a = u74Var.m11271a(z, false);
            int i5 = i4;
            long jM11271a2 = u74Var.m11271a(z, true);
            long j = z ? u74Var.f31703e : u74Var.f31708j;
            long j2 = z ? u74Var.f31701c : u74Var.f31706h;
            int i6 = i3;
            ((kq3) ir1Var.m6898k(xp3.f34516a)).getClass();
            if (d63Var == d63.f16814a) {
                tx4 tx4Var = j84.f22091a;
                nt2VarM8575c = n74.m8583k(nt2Var, 16.0f).mo7630d(n74.f25505b);
            } else {
                nt2 nt2VarM8574b = n74.m8574b(nt2Var, 1.0f);
                tx4 tx4Var2 = j84.f22091a;
                nt2VarM8575c = n74.m8575c(nt2VarM8574b, 16.0f);
            }
            int i7 = i6 & 112;
            boolean zM6886e = (i7 == 32) | ir1Var.m6886e(d63Var.ordinal());
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj2 = objM6869O;
            if (zM6886e || objM6869O == i50Var) {
                C0928n c0928n = new C0928n((byte) 23);
                c0928n.f25353b = d63Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0928n);
                obj2 = c0928n;
            }
            nt2 nt2VarMo7630d = nt2VarM8575c.mo7630d(sj3.m10829y(kt2.f23428a, (nq1) obj2));
            boolean zM6886e2 = (i7 == 32) | ir1Var.m6886e(d63Var.ordinal()) | ir1Var.m6894i(k84Var) | ((i5 & 14) == 4) | ir1Var.m6888f(jM11271a) | ir1Var.m6888f(jM11271a2) | ir1Var.m6888f(j) | ir1Var.m6888f(j2) | ((i6 & 29360128) == 8388608) | ir1Var.m6884d(0.0f) | ((i6 & 234881024) == 67108864) | ((i6 & 458752) == 131072) | ((i6 & 3670016) == 1048576) | ((i6 & 1879048192) == 536870912);
            Object objM6869O2 = ir1Var.m6869O();
            if (zM6886e2 || objM6869O2 == i50Var) {
                y74 y74Var = new y74();
                y74Var.f34995a = d63Var;
                y74Var.f34996b = k84Var;
                y74Var.f34997c = jM11271a;
                y74Var.f34998d = jM11271a2;
                y74Var.f34999e = j;
                y74Var.f35000f = j2;
                f3 = f;
                y74Var.f35001g = f3;
                f4 = f2;
                y74Var.f35002h = f4;
                mq1Var2 = mq1Var;
                y74Var.f35003i = mq1Var2;
                nq1Var2 = nq1Var;
                y74Var.f35004j = nq1Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(y74Var);
                obj = y74Var;
            } else {
                mq1Var2 = mq1Var;
                nq1Var2 = nq1Var;
                f3 = f;
                f4 = f2;
                obj = objM6869O2;
            }
            i20.m6577b(nt2VarMo7630d, (yp1) obj, ir1Var, 0);
        } else {
            f3 = f;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            z74 z74Var = new z74();
            z74Var.f35806a = this;
            z74Var.f35807b = k84Var;
            z74Var.f35808c = nt2Var;
            z74Var.f35809d = z;
            z74Var.f35810e = u74Var;
            z74Var.f35811f = mq1Var2;
            z74Var.f35812g = nq1Var2;
            z74Var.f35813h = f3;
            z74Var.f35814i = f4;
            z74Var.f35815j = i;
            z74Var.f35816k = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = z74Var;
        }
    }
}
