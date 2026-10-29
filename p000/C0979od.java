package p000;

/* JADX INFO: renamed from: od */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0979od implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26626a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ float f26627b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f26628c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f26629d;

    public /* synthetic */ C0979od(byte b) {
        this.f26626a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        byte b = this.f26626a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                float f = this.f26627b;
                t02 t02Var = (t02) this.f26628c;
                o00 o00Var = (o00) this.f26629d;
                yf2 yf2Var = (yf2) obj;
                yf2Var.m13113a();
                jp0 jp0Var = yf2Var.f35194a.f22064b;
                long jM7219E = jp0Var.m7219E();
                jp0Var.m7248w().mo6253j();
                try {
                    ar3 ar3Var = (ar3) jp0Var.f22481b;
                    ar3Var.m3130A(f, 0.0f);
                    ar3Var.m3154x(0L, 45.0f);
                    u31.m11223o(yf2Var, t02Var, o00Var);
                    return ju4Var;
                } finally {
                    d55.m4374s(jp0Var, jM7219E);
                }
            case 1:
                zx2 zx2Var = (zx2) this.f26628c;
                C0910mi c0910mi = (C0910mi) this.f26629d;
                float f2 = this.f26627b;
                jp3 jp3Var = (jp3) obj;
                yx2 yx2Var = zx2Var.f36443a;
                int iOrdinal = yx2Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        fIntBitsToFloat2 = Float.intBitsToFloat((int) (((b33) c0910mi.m8328d()).f15059a >> 32));
                    } else {
                        if (iOrdinal != 2) {
                            C0670g.m5864c();
                            return null;
                        }
                        fIntBitsToFloat2 = Float.intBitsToFloat((int) (((b33) c0910mi.m8328d()).f15059a & 4294967295L));
                    }
                    fIntBitsToFloat = -fIntBitsToFloat2;
                } else {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (((b33) c0910mi.m8328d()).f15059a >> 32));
                }
                float f3 = (fIntBitsToFloat / f2) + 1.0f;
                if (yx2Var == yx2.f35586c) {
                    jp3Var.m7258l(f3);
                    jp3Var.m7262u(zp0.m13673e(0.5f, 1.0f));
                    return ju4Var;
                }
                jp3Var.m7257k(f3);
                jp3Var.m7262u(zp0.m13673e(yx2Var != yx2.f35584a ? 1.0f : 0.0f, 0.5f));
                return ju4Var;
            case 2:
                db3 db3Var = (db3) this.f26628c;
                rm4 rm4Var = (rm4) this.f26629d;
                float fFloatValue = this.f26627b;
                cb3 cb3Var = (cb3) obj;
                C0910mi c0910mi2 = rm4Var.f29423s;
                if (c0910mi2 != null) {
                    fFloatValue = ((Number) c0910mi2.m8328d()).floatValue();
                }
                cb3.m3944n(cb3Var, db3Var, (int) fFloatValue, 0);
                return ju4Var;
            default:
                iv4 iv4Var = (iv4) this.f26628c;
                float f4 = this.f26627b;
                yp1 yp1Var = (yp1) this.f26629d;
                long jLongValue = ((Long) obj).longValue();
                long j = iv4Var.f21826b;
                if (j == Long.MIN_VALUE) {
                    iv4Var.f21826b = jLongValue;
                    j = jLongValue;
                }
                float f5 = iv4Var.f21829e;
                C0494bk c0494bk = new C0494bk(f5);
                C0494bk c0494bk2 = iv4.f21824f;
                long jMo3358c = f4 == 0.0f ? iv4Var.f21825a.mo3358c(new C0494bk(f5), c0494bk2, iv4Var.f21827c) : qq2.m10011F((jLongValue - j) / f4);
                float f6 = ((C0494bk) iv4Var.f21825a.mo4795s(jMo3358c, c0494bk, c0494bk2, iv4Var.f21827c)).f15339a;
                iv4Var.f21827c = (C0494bk) iv4Var.f21825a.mo4794p(jMo3358c, c0494bk, c0494bk2, iv4Var.f21827c);
                iv4Var.f21826b = jLongValue;
                float f7 = iv4Var.f21829e - f6;
                iv4Var.f21829e = f6;
                yp1Var.invoke(Float.valueOf(f7));
                return ju4Var;
        }
    }
}
