package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class eh3 {

    /* JADX INFO: renamed from: a */
    public static final bs0 f18092a;

    static {
        new bs0(0.3f, 0.0f, 0.8f, 0.15f);
        f18092a = new bs0(0.2f, 0.0f, 0.0f, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m5127a(nt2 nt2Var, long j, float f, long j2, int i, float f2, mi0 mi0Var, int i2) {
        long jM6745e;
        float f3;
        long j3;
        boolean z;
        float f4;
        float f5;
        float f6;
        boolean z2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(333154241);
        int i3 = i2 | 222608;
        if (ir1Var.m6871T(i3 & 1, (74899 & i3) != 74898)) {
            ir1Var.m6876Y();
            if ((i2 & 1) == 0 || ir1Var.m6856B()) {
                jM6745e = ic0.m6745e(25, ir1Var);
                j3 = pb0.f27500g;
                f5 = 4.0f;
                f6 = 4.0f;
                z2 = 1;
            } else {
                ir1Var.m6874W();
                jM6745e = j;
                f5 = f;
                j3 = j2;
                z2 = i;
                f6 = f2;
            }
            ir1Var.m6913s();
            pd4 pd4Var = new pd4(((ky0) ir1Var.m6898k(ij0.f21473h)).mo3575E(f5), 0.0f, z2 ? 1 : 0 ? 1 : 0, 0, 26);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj2 = objM6869O;
            if (objM6869O == i50Var) {
                i32 i32Var = new i32();
                i32Var.f21094a = new uw2(new f32[16]);
                i32Var.f21095b = k43.m7398w(Boolean.FALSE);
                i32Var.f21096c = Long.MIN_VALUE;
                i32Var.f21097d = k43.m7398w(Boolean.TRUE);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(i32Var);
                obj2 = i32Var;
            }
            i32 i32Var2 = (i32) obj2;
            i32Var2.m6636a(0, ir1Var);
            f32 f32VarM10722g = se0.m10722g(i32Var2, 0.0f, 1080.0f, qq2.m10037u(qq2.m10016K(6000, 0, h51.f20398c, 2), 6), ir1Var);
            t63 t63Var = new t63((byte) 5);
            qd2 qd2Var = new qd2();
            float f7 = f5;
            qd2Var.f28397a = (short) 300;
            lv2 lv2Var = n52.f25469a;
            qd2Var.f28398b = new lv2();
            t63Var.invoke(qd2Var);
            rd2 rd2Var = new rd2();
            rd2Var.f29184a = qd2Var;
            VarHandle.storeStoreFence();
            f32 f32VarM10722g2 = se0.m10722g(i32Var2, 0.0f, 360.0f, qq2.m10037u(rd2Var, 6), ir1Var);
            qd2 qd2Var2 = new qd2();
            qd2Var2.f28397a = (short) 300;
            qd2Var2.f28398b = new lv2();
            qd2Var2.f28397a = (short) 6000;
            float f8 = f6;
            qd2Var2.m9862a(Float.valueOf(0.87f), 3000).f27534b = f18092a;
            qd2Var2.m9862a(Float.valueOf(0.1f), 6000);
            rd2 rd2Var2 = new rd2();
            rd2Var2.f29184a = qd2Var2;
            VarHandle.storeStoreFence();
            f32 f32VarM10722g3 = se0.m10722g(i32Var2, 0.1f, 0.87f, qq2.m10037u(rd2Var2, 6), ir1Var);
            nt2 nt2VarM8579g = n74.m8579g(f14.m5458a(nt2Var, true, new t63((byte) 6)), 40.0f);
            boolean zM6890g = ir1Var.m6890g(f32VarM10722g3) | ir1Var.m6890g(f32VarM10722g) | ir1Var.m6890g(f32VarM10722g2) | ir1Var.m6888f(j3) | ir1Var.m6894i(pd4Var) | ir1Var.m6888f(jM6745e);
            Object objM6869O2 = ir1Var.m6869O();
            if (zM6890g || objM6869O2 == i50Var) {
                ch3 ch3Var = new ch3();
                ch3Var.f16021a = f32VarM10722g3;
                ch3Var.f16022b = z2;
                f4 = f8;
                ch3Var.f16023c = f4;
                f3 = f7;
                ch3Var.f16024d = f3;
                ch3Var.f16025e = f32VarM10722g;
                ch3Var.f16026f = f32VarM10722g2;
                ch3Var.f16027g = j3;
                ch3Var.f16028h = pd4Var;
                ch3Var.f16029i = jM6745e;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ch3Var);
                obj = ch3Var;
            } else {
                f3 = f7;
                f4 = f8;
                obj = objM6869O2;
            }
            i20.m6577b(nt2VarM8579g, (yp1) obj, ir1Var, 0);
            z = z2;
        } else {
            ir1Var.m6874W();
            jM6745e = j;
            f3 = f;
            j3 = j2;
            z = i;
            f4 = f2;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            dh3 dh3Var = new dh3();
            dh3Var.f17051a = nt2Var;
            dh3Var.f17052b = jM6745e;
            dh3Var.f17053c = f3;
            dh3Var.f17054d = j3;
            dh3Var.f17055e = z;
            dh3Var.f17056f = f4;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = dh3Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5128b(u31 u31Var, float f, float f2, long j, pd4 pd4Var) {
        float f3 = pd4Var.f27547j / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)) - (2.0f * f3);
        u31Var.mo7039g(j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), pd4Var);
    }
}
