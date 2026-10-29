package p000;

import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xd2 implements sf3, o64, y73, w73, gd2, ed2, gx0, k11 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34169a;

    public /* synthetic */ xd2(byte b) {
        this.f34169a = b;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m12664k(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m12665l(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m12666m(Object obj, String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m12667n(String str, Object obj, Object obj2) {
        throw new gf0(str + obj + obj2);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m12668o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m12669p(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // p000.w73
    /* JADX INFO: renamed from: a */
    public t73 mo4669a(nh3 nh3Var) throws GeneralSecurityException {
        switch (this.f34169a) {
            case 7:
                jd2 jd2Var = (jd2) nh3Var.f25811c;
                if (!jd2Var.m7076z().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    xy4.m12781j(jd2Var.m7076z(), "Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    String strM5980y = ge2.m5976A(jd2Var.m7071A(), qc1.m9861a()).m5980y();
                    C0973o7 c0973o7M7526b = kj2.m7526b(jd2Var.m7075y());
                    jj2 jj2Var = new jj2();
                    jj2Var.f22330a = strM5980y;
                    jj2Var.f22331b = c0973o7M7526b;
                    VarHandle.storeStoreFence();
                    return jj2Var;
                } catch (h72 e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            case 11:
                jd2 jd2Var2 = (jd2) nh3Var.f25811c;
                if (!jd2Var2.m7076z().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    xy4.m12781j(jd2Var2.m7076z(), "Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    return nj2.m8781a(me2.m8288B(jd2Var2.m7071A(), qc1.m9861a()), jd2Var2.m7075y());
                } catch (h72 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                }
            default:
                jd2 jd2Var3 = (jd2) nh3Var.f25811c;
                if (!jd2Var3.m7076z().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    xy4.m12781j(jd2Var3.m7076z(), "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    tr3 tr3VarM11113B = tr3.m11113B(jd2Var3.m7071A(), qc1.m9861a());
                    ur3 ur3VarM12753b = xr3.m12753b();
                    ur3VarM12753b.f32119c = (vr3) es3.f18438h.m8737D(tr3VarM11113B.m11118y().m13732y());
                    ur3VarM12753b.f32118b = ev0.m5351a0(tr3VarM11113B.m11119z().m10981l());
                    ur3VarM12753b.f32117a = Integer.valueOf(tr3VarM11113B.m11117x());
                    ur3VarM12753b.f32120d = (wr3) es3.f18437g.m8737D(jd2Var3.m7075y());
                    return ur3VarM12753b.m11635a();
                } catch (h72 e3) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e3);
                }
        }
    }

    @Override // p000.sf3
    /* JADX INFO: renamed from: b */
    public Object mo4670b(se0 se0Var) throws GeneralSecurityException {
        byte b = this.f34169a;
        j63 j63Var = j63.f22046d;
        byte b2 = 1;
        switch (b) {
            case 3:
                ie2.m6772a(((ij2) se0Var).f21494u.f22330a);
                throw null;
            case 4:
                ie2.m6772a(((lj2) se0Var).f24067u.f24968b);
                throw null;
            case 14:
                mh3 mh3Var = ((rj2) se0Var).f29353u;
                Integer num = mh3Var.f24922f;
                mh3Var.f24920d.ordinal();
                int iOrdinal = mh3Var.f24921e.ordinal();
                if (iOrdinal == 1) {
                    k63.m7411b(num.intValue()).m11250c();
                } else if (iOrdinal == 2) {
                    k63.m7410a(num.intValue()).m11250c();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        xy4.m12788q("unknown output prefix type");
                        return null;
                    }
                    k63.m7410a(num.intValue()).m11250c();
                } else {
                    k63.f22941a.m11250c();
                }
                return new nf3();
            case 20:
                mh3 mh3Var2 = ((rj2) se0Var).f29353u;
                mh3Var2.f24920d.ordinal();
                o61.m8966b(mh3Var2);
                mh3Var2.f24921e.equals(j63Var);
                v51 v51Var = new v51();
                VarHandle.storeStoreFence();
                return v51Var;
            default:
                mh3 mh3Var3 = ((rj2) se0Var).f29353u;
                mh3Var3.f24920d.ordinal();
                ei3 ei3Var = (ei3) zc2.f35977d.m13501a(ei3.class, mh3Var3.f24917a).m6414a(mh3Var3.f24919c);
                byte[] bArrM8966b = o61.m8966b(mh3Var3);
                byte[] bArr = mh3Var3.f24921e.equals(j63Var) ? new byte[]{0} : new byte[0];
                o61 o61Var = new o61(b2);
                o61Var.f26370d = ei3Var;
                o61Var.f26368b = bArrM8966b;
                o61Var.f26369c = bArr;
                VarHandle.storeStoreFence();
                return o61Var;
        }
    }

    @Override // p000.gd2
    /* JADX INFO: renamed from: d */
    public mh3 mo4672d(se0 se0Var) {
        byte b = this.f34169a;
        qc2 qc2Var = qc2.f28379f;
        switch (b) {
            case 8:
                ij2 ij2Var = (ij2) se0Var;
                de2 de2VarM5097z = ee2.m5097z();
                fe2 fe2VarM5978z = ge2.m5978z();
                String str = ij2Var.f21494u.f22330a;
                fe2VarM5978z.m9631e();
                ((ge2) fe2VarM5978z.f27912b).m5979B(str);
                ge2 ge2Var = (ge2) fe2VarM5978z.m9628b();
                de2VarM5097z.m9631e();
                ((ee2) de2VarM5097z.f27912b).m5098C(ge2Var);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((ee2) de2VarM5097z.m9628b()).m11693f(), qc2Var, kj2.m7525a(ij2Var.f21494u.f22331b), ij2Var.f21496w);
            case 12:
                lj2 lj2Var = (lj2) se0Var;
                je2 je2VarM7506z = ke2.m7506z();
                me2 me2VarM8782b = nj2.m8782b(lj2Var.f24067u);
                je2VarM7506z.m9631e();
                ((ke2) je2VarM7506z.f27912b).m7507C(me2VarM8782b);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((ke2) je2VarM7506z.m9628b()).m11693f(), qc2Var, nj2.m8783c(lj2Var.f24067u.f24967a), lj2Var.f24069w);
            case 16:
                mh3 mh3Var = ((rj2) se0Var).f29353u;
                mh3Var.f24920d.ordinal();
                return mh3Var;
            case 27:
                gs3 gs3Var = (gs3) se0Var;
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", es3.m5321c(gs3Var).m11693f(), qc2.f28378e, (j63) es3.f18437g.m8745L(gs3Var.f20093u.f34566c), gs3Var.f20096x);
            default:
                bs3 bs3Var = (bs3) se0Var;
                as3 as3VarM4147F = cs3.m4147F();
                as3VarM4147F.m9631e();
                ((cs3) as3VarM4147F.f27912b).m4162P();
                hs3 hs3VarM5321c = es3.m5321c(bs3Var.f15548u);
                as3VarM4147F.m9631e();
                ((cs3) as3VarM4147F.f27912b).m4160N(hs3VarM5321c);
                o50 o50VarM5320b = es3.m5320b((BigInteger) bs3Var.f15549v.f33090b);
                as3VarM4147F.m9631e();
                ((cs3) as3VarM4147F.f27912b).m4156J(o50VarM5320b);
                o50 o50VarM5320b2 = es3.m5320b((BigInteger) bs3Var.f15550w.f33090b);
                as3VarM4147F.m9631e();
                ((cs3) as3VarM4147F.f27912b).m4159M(o50VarM5320b2);
                o50 o50VarM5320b3 = es3.m5320b((BigInteger) bs3Var.f15551x.f33090b);
                as3VarM4147F.m9631e();
                ((cs3) as3VarM4147F.f27912b).m4161O(o50VarM5320b3);
                o50 o50VarM5320b4 = es3.m5320b((BigInteger) bs3Var.f15552y.f33090b);
                as3VarM4147F.m9631e();
                ((cs3) as3VarM4147F.f27912b).m4157K(o50VarM5320b4);
                o50 o50VarM5320b5 = es3.m5320b((BigInteger) bs3Var.f15553z.f33090b);
                as3VarM4147F.m9631e();
                ((cs3) as3VarM4147F.f27912b).m4158L(o50VarM5320b5);
                o50 o50VarM5320b6 = es3.m5320b((BigInteger) bs3Var.f15547A.f33090b);
                as3VarM4147F.m9631e();
                ((cs3) as3VarM4147F.f27912b).m4155I(o50VarM5320b6);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((cs3) as3VarM4147F.m9628b()).m11693f(), qc2.f28377d, (j63) es3.f18437g.m8745L(bs3Var.f15548u.f20093u.f34566c), bs3Var.mo4966A());
        }
    }

    @Override // p000.ed2
    /* JADX INFO: renamed from: f */
    public se0 mo4673f(m24 m24Var) throws GeneralSecurityException {
        mh3 mh3Var = (mh3) m24Var;
        switch (this.f34169a) {
            case 9:
                if (!mh3Var.f24917a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    C1077qn.m9987m("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    ee2 ee2VarM5095A = ee2.m5095A(mh3Var.f24919c, qc1.m9861a());
                    if (ee2VarM5095A.m5100y() != 0) {
                        throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + ee2VarM5095A);
                    }
                    String strM5980y = ee2VarM5095A.m5099x().m5980y();
                    C0973o7 c0973o7M7526b = kj2.m7526b(mh3Var.f24921e);
                    jj2 jj2Var = new jj2();
                    jj2Var.f22330a = strM5980y;
                    jj2Var.f22331b = c0973o7M7526b;
                    VarHandle.storeStoreFence();
                    return ij2.m6813l0(jj2Var, mh3Var.f24922f);
                } catch (h72 e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            case 13:
                if (!mh3Var.f24917a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    C1077qn.m9987m("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    ke2 ke2VarM7504A = ke2.m7504A(mh3Var.f24919c, qc1.m9861a());
                    if (ke2VarM7504A.m7509y() == 0) {
                        return lj2.m7991l0(nj2.m8781a(ke2VarM7504A.m7508x(), mh3Var.f24921e), mh3Var.f24922f);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + ke2VarM7504A);
                } catch (h72 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
            default:
                String str = mh3Var.f24917a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    wb1.m12195o(str, "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ");
                    return null;
                }
                try {
                    hs3 hs3VarM6493D = hs3.m6493D(mh3Var.f24919c, qc1.m9861a());
                    if (hs3VarM6493D.m6497B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigIntegerM5351a0 = ev0.m5351a0(hs3VarM6493D.m6502z().m10981l());
                    int iBitLength = bigIntegerM5351a0.bitLength();
                    ur3 ur3VarM12753b = xr3.m12753b();
                    ur3VarM12753b.f32119c = (vr3) es3.f18438h.m8737D(hs3VarM6493D.m6496A().m13732y());
                    ur3VarM12753b.f32118b = ev0.m5351a0(hs3VarM6493D.m6501y().m10981l());
                    ur3VarM12753b.f32117a = Integer.valueOf(iBitLength);
                    ur3VarM12753b.f32120d = (wr3) es3.f18437g.m8737D(mh3Var.f24921e);
                    xr3 xr3VarM11635a = ur3VarM12753b.m11635a();
                    tt2 tt2Var = new tt2((byte) 6, false);
                    tt2Var.f31428b = xr3VarM11635a;
                    tt2Var.f31429c = bigIntegerM5351a0;
                    tt2Var.f31430d = mh3Var.f24922f;
                    return tt2Var.m11151k();
                } catch (h72 | IllegalArgumentException unused) {
                    xy4.m12788q("Parsing RsaSsaPkcs1PublicKey failed");
                    return null;
                }
        }
    }

    @Override // p000.o64
    /* JADX INFO: renamed from: g */
    public boolean mo8969g() {
        return false;
    }

    @Override // p000.y73
    /* JADX INFO: renamed from: i */
    public nh3 mo4674i(t73 t73Var) {
        switch (this.f34169a) {
            case 6:
                jj2 jj2Var = (jj2) t73Var;
                id2 id2VarM7068B = jd2.m7068B();
                id2VarM7068B.m6763g("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                fe2 fe2VarM5978z = ge2.m5978z();
                String str = jj2Var.f22330a;
                fe2VarM5978z.m9631e();
                ((ge2) fe2VarM5978z.f27912b).m5979B(str);
                id2VarM7068B.m6764h(((ge2) fe2VarM5978z.m9628b()).m11693f());
                id2VarM7068B.m6762f(kj2.m7525a(jj2Var.f22331b));
                return nh3.m8734l((jd2) id2VarM7068B.m9628b());
            case 10:
                mj2 mj2Var = (mj2) t73Var;
                id2 id2VarM7068B2 = jd2.m7068B();
                id2VarM7068B2.m6763g("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                id2VarM7068B2.m6764h(nj2.m8782b(mj2Var).m11693f());
                id2VarM7068B2.m6762f(nj2.m8783c(mj2Var.f24967a));
                return nh3.m8734l((jd2) id2VarM7068B2.m9628b());
            default:
                xr3 xr3Var = (xr3) t73Var;
                id2 id2VarM7068B3 = jd2.m7068B();
                id2VarM7068B3.m6763g("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                sr3 sr3VarM11112A = tr3.m11112A();
                yr3 yr3VarM13730z = zr3.m13730z();
                pv1 pv1Var = (pv1) es3.f18438h.m8745L(xr3Var.f34567d);
                yr3VarM13730z.m9631e();
                ((zr3) yr3VarM13730z.f27912b).m13731A(pv1Var);
                zr3 zr3Var = (zr3) yr3VarM13730z.m9628b();
                sr3VarM11112A.m9631e();
                ((tr3) sr3VarM11112A.f27912b).m11115D(zr3Var);
                int i = xr3Var.f34564a;
                sr3VarM11112A.m9631e();
                ((tr3) sr3VarM11112A.f27912b).m11114C(i);
                o50 o50VarM5320b = es3.m5320b(xr3Var.f34565b);
                sr3VarM11112A.m9631e();
                ((tr3) sr3VarM11112A.f27912b).m11116E(o50VarM5320b);
                id2VarM7068B3.m6764h(((tr3) sr3VarM11112A.m9628b()).m11693f());
                id2VarM7068B3.m6762f((j63) es3.f18437g.m8745L(xr3Var.f34566c));
                return nh3.m8734l((jd2) id2VarM7068B3.m9628b());
        }
    }

    /* JADX INFO: renamed from: j */
    public Object m12671j() {
        nw2 nw2Var = new nw2();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        r24 r24Var = new r24();
        r24Var.f28970a = new HashMap(map);
        r24Var.f28971b = new HashMap(map2);
        r24Var.f28972c = new HashMap(map3);
        r24Var.f28973d = new HashMap(map4);
        VarHandle.storeStoreFence();
        nw2Var.f26152a = new AtomicReference(r24Var);
        VarHandle.storeStoreFence();
        nw2Var.m8873c(fd2.m5692a(new xd2((byte) 16), rj2.class));
        return nw2Var;
    }

    @Override // p000.gx0
    /* JADX INFO: renamed from: c */
    public void mo6188c(bi3 bi3Var) {
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: e */
    public double mo7356e(double d) {
        return d;
    }

    /* JADX INFO: renamed from: h */
    public void m12670h(yd2 yd2Var) {
    }
}
