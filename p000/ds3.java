package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ds3 implements ed2, sf3, y73, w73, gd2, nt3, xm0, qe4, np4, gg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17332a;

    public /* synthetic */ ds3(byte b) {
        this.f17332a = b;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m4665g() {
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m4666j(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m4667k(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m4668l(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    @Override // p000.w73
    /* JADX INFO: renamed from: a */
    public t73 mo4669a(nh3 nh3Var) throws GeneralSecurityException {
        jd2 jd2Var = (jd2) nh3Var.f25811c;
        if (!jd2Var.m7076z().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            xy4.m12781j(jd2Var.m7076z(), "Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ");
            return null;
        }
        try {
            ns3 ns3VarM8838B = ns3.m8838B(jd2Var.m7071A(), qc1.m9861a());
            os3 os3VarM10422b = rs3.m10422b();
            nh3 nh3Var2 = xs3.f34597h;
            os3VarM10422b.f27059c = (ps3) nh3Var2.m8737D(ns3VarM8838B.m8843y().m11123A());
            os3VarM10422b.f27060d = (ps3) nh3Var2.m8737D(ns3VarM8838B.m8843y().m11127y());
            os3VarM10422b.f27058b = ev0.m5351a0(ns3VarM8838B.m8844z().m10981l());
            os3VarM10422b.f27057a = Integer.valueOf(ns3VarM8838B.m8842x());
            os3VarM10422b.m9257b(ns3VarM8838B.m8843y().m11128z());
            os3VarM10422b.f27062f = (qs3) xs3.f34596g.m8737D(jd2Var.m7075y());
            return os3VarM10422b.m9256a();
        } catch (h72 e) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e);
        }
    }

    @Override // p000.nt3
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                jp0 jp0VarM4741a = C0588dv.m4741a();
                jp0VarM4741a.m7225O(cursorRawQuery.getString(1));
                jp0VarM4741a.f22483d = bg3.m3589b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                jp0VarM4741a.f22481b = string == null ? null : Base64.decode(string, 0);
                arrayList.add(jp0VarM4741a.m7241j());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0189  */
    @Override // p000.sf3
    /* JADX INFO: renamed from: b */
    public Object mo4670b(se0 se0Var) throws GeneralSecurityException {
        Provider providerM13360S;
        switch (this.f17332a) {
            case 1:
                bs3 bs3Var = (bs3) se0Var;
                int i = yv4.f35553a;
                if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    if ((!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).intValue() <= 21) {
                        providerM13360S = null;
                    } else {
                        providerM13360S = z62.m13360S();
                    }
                } else {
                    providerM13360S = z62.m13360S();
                }
                KeyFactory keyFactory = providerM13360S != null ? KeyFactory.getInstance("RSA", providerM13360S) : (KeyFactory) n81.f25517f.f25518a.mo3139g("RSA");
                gs3 gs3Var = bs3Var.f15548u;
                BigInteger bigInteger = gs3Var.f20094v;
                xr3 xr3Var = gs3Var.f20093u;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, xr3Var.f34565b, (BigInteger) bs3Var.f15549v.f33090b, (BigInteger) bs3Var.f15550w.f33090b, (BigInteger) bs3Var.f15551x.f33090b, (BigInteger) bs3Var.f15552y.f33090b, (BigInteger) bs3Var.f15553z.f33090b, (BigInteger) bs3Var.f15547A.f33090b));
                ei3 ei3VarM7592b = providerM13360S != null ? ks3.m7592b(gs3Var, providerM13360S) : ls3.m8103b(gs3Var);
                vr3 vr3Var = xr3Var.f34567d;
                byte[] bArrM11250c = bs3Var.m11754k0().m11250c();
                byte[] bArr = xr3Var.f34566c.equals(wr3.f33660d) ? is3.f21754h : is3.f21753g;
                is3 is3Var = new is3();
                if (!zi4.m13604d(2)) {
                    xy4.m12788q("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
                    return null;
                }
                if (vr3Var != vr3.f32809b && vr3Var != vr3.f32810c && vr3Var != vr3.f32811d) {
                    xd2.m12666m(vr3Var, "Unsupported hash: ");
                    return null;
                }
                kw4.m7670b(rSAPrivateCrtKey.getModulus().bitLength());
                kw4.m7671c(rSAPrivateCrtKey.getPublicExponent());
                is3Var.f21756a = rSAPrivateCrtKey;
                is3Var.f21757b = ks3.m7593c(vr3Var);
                is3Var.f21758c = bArrM11250c;
                is3Var.f21759d = bArr;
                is3Var.f21760e = ei3VarM7592b;
                is3Var.f21761f = providerM13360S;
                VarHandle.storeStoreFence();
                String str = is3Var.f21757b;
                Provider provider = is3Var.f21761f;
                Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) n81.f25515d.f25518a.mo3139g(str);
                signature.initSign(is3Var.f21756a);
                byte[] bArr2 = is3.f21755i;
                signature.update(bArr2);
                byte[] bArr3 = is3Var.f21759d;
                if (bArr3.length > 0) {
                    signature.update(bArr3);
                }
                byte[] bArrSign = signature.sign();
                byte[] bArr4 = is3Var.f21758c;
                if (bArr4.length > 0) {
                    bArrSign = zc6.m13537w(bArr4, bArrSign);
                }
                try {
                    is3Var.f21760e.mo4729a(bArrSign, bArr2);
                    return is3Var;
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException("RSA signature computation error", e);
                }
            case 2:
                return ls3.m8103b((gs3) se0Var);
            case 9:
                vs3 vs3Var = (vs3) se0Var;
                try {
                    return v51.m11749b(vs3Var);
                } catch (NoSuchProviderException unused) {
                    KeyFactory keyFactory2 = (KeyFactory) n81.f25517f.f25518a.mo3139g("RSA");
                    zs3 zs3Var = vs3Var.f32834u;
                    zs3 zs3Var2 = vs3Var.f32834u;
                    BigInteger bigInteger2 = zs3Var.f36343v;
                    rs3 rs3Var = zs3Var2.f36342u;
                    rs3 rs3Var2 = zs3Var2.f36342u;
                    RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory2.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger2, rs3Var.f29583b, (BigInteger) vs3Var.f32835v.f33090b, (BigInteger) vs3Var.f32836w.f33090b, (BigInteger) vs3Var.f32837x.f33090b, (BigInteger) vs3Var.f32838y.f33090b, (BigInteger) vs3Var.f32839z.f33090b, (BigInteger) vs3Var.f32833A.f33090b));
                    aa1 aa1Var = (aa1) ft3.f19278a.m8745L(rs3Var2.f29585d);
                    aa1 aa1Var2 = (aa1) ft3.f19278a.m8745L(rs3Var2.f29586e);
                    vs3Var.m11754k0().m11250c();
                    rs3Var2.f29584c.getClass();
                    v51 v51Var = new v51();
                    if (cn4.m4052a()) {
                        xy4.m12788q("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                        return null;
                    }
                    kw4.m7672d(aa1Var);
                    if (!aa1Var.equals(aa1Var2)) {
                        xy4.m12788q("sigHash and mgf1Hash must be the same");
                        return null;
                    }
                    kw4.m7670b(rSAPrivateCrtKey2.getModulus().bitLength());
                    kw4.m7671c(rSAPrivateCrtKey2.getPublicExponent());
                    VarHandle.storeStoreFence();
                    return v51Var;
                }
            default:
                zs3 zs3Var3 = (zs3) se0Var;
                nh3 nh3Var = ft3.f19278a;
                try {
                    return dt3.m4726b(zs3Var3);
                } catch (NoSuchProviderException unused2) {
                    KeyFactory keyFactory3 = (KeyFactory) n81.f25517f.f25518a.mo3139g("RSA");
                    BigInteger bigInteger3 = zs3Var3.f36343v;
                    rs3 rs3Var3 = zs3Var3.f36342u;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory3.generatePublic(new RSAPublicKeySpec(bigInteger3, rs3Var3.f29583b));
                    aa1 aa1Var3 = (aa1) nh3Var.m8745L(rs3Var3.f29585d);
                    aa1 aa1Var4 = (aa1) nh3Var.m8745L(rs3Var3.f29586e);
                    int i2 = rs3Var3.f29587f;
                    byte[] bArrM11250c2 = zs3Var3.f36344w.m11250c();
                    byte[] bArr5 = rs3Var3.f29584c.equals(qs3.f28763d) ? ft3.f19280c : ft3.f19279b;
                    et3 et3Var = new et3();
                    if (cn4.m4052a()) {
                        xy4.m12788q("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                        return null;
                    }
                    kw4.m7672d(aa1Var3);
                    if (!aa1Var3.equals(aa1Var4)) {
                        xy4.m12788q("sigHash and mgf1Hash must be the same");
                        return null;
                    }
                    kw4.m7670b(rSAPublicKey.getModulus().bitLength());
                    kw4.m7671c(rSAPublicKey.getPublicExponent());
                    et3Var.f18471a = rSAPublicKey;
                    et3Var.f18472b = aa1Var3;
                    et3Var.f18473c = aa1Var4;
                    et3Var.f18474d = i2;
                    et3Var.f18475e = bArrM11250c2;
                    et3Var.f18476f = bArr5;
                    VarHandle.storeStoreFence();
                    return et3Var;
                }
        }
    }

    @Override // p000.gd2
    /* JADX INFO: renamed from: d */
    public mh3 mo4672d(se0 se0Var) {
        switch (this.f17332a) {
            case 5:
                zs3 zs3Var = (zs3) se0Var;
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", xs3.m12758d(zs3Var).m11693f(), qc2.f28378e, (j63) xs3.f34596g.m8745L(zs3Var.f36342u.f29584c), zs3Var.f36345x);
            default:
                vs3 vs3Var = (vs3) se0Var;
                us3 us3VarM12389F = ws3.m12389F();
                us3VarM12389F.m9631e();
                ((ws3) us3VarM12389F.f27912b).m12404P();
                at3 at3VarM12758d = xs3.m12758d(vs3Var.f32834u);
                us3VarM12389F.m9631e();
                ((ws3) us3VarM12389F.f27912b).m12402N(at3VarM12758d);
                o50 o50VarM12756b = xs3.m12756b((BigInteger) vs3Var.f32835v.f33090b);
                us3VarM12389F.m9631e();
                ((ws3) us3VarM12389F.f27912b).m12398J(o50VarM12756b);
                o50 o50VarM12756b2 = xs3.m12756b((BigInteger) vs3Var.f32836w.f33090b);
                us3VarM12389F.m9631e();
                ((ws3) us3VarM12389F.f27912b).m12401M(o50VarM12756b2);
                o50 o50VarM12756b3 = xs3.m12756b((BigInteger) vs3Var.f32837x.f33090b);
                us3VarM12389F.m9631e();
                ((ws3) us3VarM12389F.f27912b).m12403O(o50VarM12756b3);
                o50 o50VarM12756b4 = xs3.m12756b((BigInteger) vs3Var.f32838y.f33090b);
                us3VarM12389F.m9631e();
                ((ws3) us3VarM12389F.f27912b).m12399K(o50VarM12756b4);
                o50 o50VarM12756b5 = xs3.m12756b((BigInteger) vs3Var.f32839z.f33090b);
                us3VarM12389F.m9631e();
                ((ws3) us3VarM12389F.f27912b).m12400L(o50VarM12756b5);
                o50 o50VarM12756b6 = xs3.m12756b((BigInteger) vs3Var.f32833A.f33090b);
                us3VarM12389F.m9631e();
                ((ws3) us3VarM12389F.f27912b).m12397I(o50VarM12756b6);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((ws3) us3VarM12389F.m9628b()).m11693f(), qc2.f28377d, (j63) xs3.f34596g.m8745L(vs3Var.f32834u.f36342u.f29584c), vs3Var.mo4966A());
        }
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public Object mo3007e(C0602e8 c0602e8) {
        switch (this.f17332a) {
            case 23:
                return TransportRegistrar.lambda$getComponents$0(c0602e8);
            case 24:
                return TransportRegistrar.lambda$getComponents$1(c0602e8);
            default:
                return TransportRegistrar.lambda$getComponents$2(c0602e8);
        }
    }

    @Override // p000.ed2
    /* JADX INFO: renamed from: f */
    public se0 mo4673f(m24 m24Var) throws GeneralSecurityException {
        byte b = 7;
        boolean z = false;
        mh3 mh3Var = (mh3) m24Var;
        switch (this.f17332a) {
            case 0:
                String str = mh3Var.f24917a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    wb1.m12195o(str, "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ");
                    return null;
                }
                try {
                    cs3 cs3VarM4148G = cs3.m4148G(mh3Var.f24919c, qc1.m9861a());
                    if (cs3VarM4148G.m4154E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    hs3 hs3VarM4152C = cs3VarM4148G.m4152C();
                    if (hs3VarM4152C.m6497B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigIntegerM5351a0 = ev0.m5351a0(hs3VarM4152C.m6502z().m10981l());
                    int iBitLength = bigIntegerM5351a0.bitLength();
                    BigInteger bigIntegerM5351a1 = ev0.m5351a0(hs3VarM4152C.m6501y().m10981l());
                    ur3 ur3VarM12753b = xr3.m12753b();
                    ur3VarM12753b.f32119c = (vr3) es3.f18438h.m8737D(hs3VarM4152C.m6496A().m13732y());
                    ur3VarM12753b.f32118b = bigIntegerM5351a1;
                    ur3VarM12753b.f32117a = Integer.valueOf(iBitLength);
                    ur3VarM12753b.f32120d = (wr3) es3.f18437g.m8737D(mh3Var.f24921e);
                    xr3 xr3VarM11635a = ur3VarM12753b.m11635a();
                    tt2 tt2Var = new tt2((byte) 6, z);
                    tt2Var.f31428b = xr3VarM11635a;
                    tt2Var.f31429c = bigIntegerM5351a0;
                    tt2Var.f31430d = mh3Var.f24922f;
                    gs3 gs3VarM11151k = tt2Var.m11151k();
                    lg0 lg0Var = new lg0();
                    lg0Var.f24017b = null;
                    lg0Var.f24018c = null;
                    lg0Var.f24019d = null;
                    lg0Var.f24020e = null;
                    lg0Var.f24021f = null;
                    lg0Var.f24022g = null;
                    lg0Var.f24016a = gs3VarM11151k;
                    w42 w42VarM5319a = es3.m5319a(cs3VarM4148G.m4151B());
                    w42 w42VarM5319a2 = es3.m5319a(cs3VarM4148G.m4153D());
                    lg0Var.f24018c = w42VarM5319a;
                    lg0Var.f24019d = w42VarM5319a2;
                    lg0Var.f24017b = es3.m5319a(cs3VarM4148G.m4164y());
                    w42 w42VarM5319a3 = es3.m5319a(cs3VarM4148G.m4165z());
                    w42 w42VarM5319a4 = es3.m5319a(cs3VarM4148G.m4150A());
                    lg0Var.f24020e = w42VarM5319a3;
                    lg0Var.f24021f = w42VarM5319a4;
                    lg0Var.f24022g = es3.m5319a(cs3VarM4148G.m4163x());
                    return lg0Var.m7962h();
                } catch (h72 | IllegalArgumentException unused) {
                    xy4.m12788q("Parsing RsaSsaPkcs1PrivateKey failed");
                    return null;
                }
            case 6:
                String str2 = mh3Var.f24917a;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    wb1.m12195o(str2, "Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ");
                    return null;
                }
                try {
                    at3 at3VarM3297D = at3.m3297D(mh3Var.f24919c, qc1.m9861a());
                    if (at3VarM3297D.m3301B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigIntegerM5351a2 = ev0.m5351a0(at3VarM3297D.m3307z().m10981l());
                    int iBitLength2 = bigIntegerM5351a2.bitLength();
                    os3 os3VarM10422b = rs3.m10422b();
                    nh3 nh3Var = xs3.f34597h;
                    os3VarM10422b.f27059c = (ps3) nh3Var.m8737D(at3VarM3297D.m3300A().m11123A());
                    os3VarM10422b.f27060d = (ps3) nh3Var.m8737D(at3VarM3297D.m3300A().m11127y());
                    os3VarM10422b.f27058b = ev0.m5351a0(at3VarM3297D.m3306y().m10981l());
                    os3VarM10422b.f27057a = Integer.valueOf(iBitLength2);
                    os3VarM10422b.m9257b(at3VarM3297D.m3300A().m11128z());
                    os3VarM10422b.f27062f = (qs3) xs3.f34596g.m8737D(mh3Var.f24921e);
                    rs3 rs3VarM9256a = os3VarM10422b.m9256a();
                    tt2 tt2Var2 = new tt2(b, z);
                    tt2Var2.f31428b = rs3VarM9256a;
                    tt2Var2.f31429c = bigIntegerM5351a2;
                    tt2Var2.f31430d = mh3Var.f24922f;
                    return tt2Var2.m11152r();
                } catch (h72 | IllegalArgumentException unused2) {
                    xy4.m12788q("Parsing RsaSsaPssPublicKey failed");
                    return null;
                }
            default:
                String str3 = mh3Var.f24917a;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    wb1.m12195o(str3, "Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ");
                    return null;
                }
                try {
                    ws3 ws3VarM12390G = ws3.m12390G(mh3Var.f24919c, qc1.m9861a());
                    if (ws3VarM12390G.m12396E() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    at3 at3VarM12394C = ws3VarM12390G.m12394C();
                    if (at3VarM12394C.m3301B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigIntegerM5351a3 = ev0.m5351a0(at3VarM12394C.m3307z().m10981l());
                    int iBitLength3 = bigIntegerM5351a3.bitLength();
                    BigInteger bigIntegerM5351a4 = ev0.m5351a0(at3VarM12394C.m3306y().m10981l());
                    os3 os3VarM10422b2 = rs3.m10422b();
                    nh3 nh3Var2 = xs3.f34597h;
                    os3VarM10422b2.f27059c = (ps3) nh3Var2.m8737D(at3VarM12394C.m3300A().m11123A());
                    os3VarM10422b2.f27060d = (ps3) nh3Var2.m8737D(at3VarM12394C.m3300A().m11127y());
                    os3VarM10422b2.f27058b = bigIntegerM5351a4;
                    os3VarM10422b2.f27057a = Integer.valueOf(iBitLength3);
                    os3VarM10422b2.m9257b(at3VarM12394C.m3300A().m11128z());
                    os3VarM10422b2.f27062f = (qs3) xs3.f34596g.m8737D(mh3Var.f24921e);
                    rs3 rs3VarM9256a2 = os3VarM10422b2.m9256a();
                    tt2 tt2Var3 = new tt2(b, z);
                    tt2Var3.f31428b = rs3VarM9256a2;
                    tt2Var3.f31429c = bigIntegerM5351a3;
                    tt2Var3.f31430d = mh3Var.f24922f;
                    zs3 zs3VarM11152r = tt2Var3.m11152r();
                    if1 if1Var = new if1();
                    if1Var.f21325b = null;
                    if1Var.f21326c = null;
                    if1Var.f21327d = null;
                    if1Var.f21328e = null;
                    if1Var.f21329f = null;
                    if1Var.f21330g = null;
                    if1Var.f21324a = zs3VarM11152r;
                    w42 w42VarM12755a = xs3.m12755a(ws3VarM12390G.m12393B());
                    w42 w42VarM12755a2 = xs3.m12755a(ws3VarM12390G.m12395D());
                    if1Var.f21326c = w42VarM12755a;
                    if1Var.f21327d = w42VarM12755a2;
                    if1Var.f21325b = xs3.m12755a(ws3VarM12390G.m12406y());
                    w42 w42VarM12755a3 = xs3.m12755a(ws3VarM12390G.m12407z());
                    w42 w42VarM12755a4 = xs3.m12755a(ws3VarM12390G.m12392A());
                    if1Var.f21328e = w42VarM12755a3;
                    if1Var.f21329f = w42VarM12755a4;
                    if1Var.f21330g = xs3.m12755a(ws3VarM12390G.m12405x());
                    return if1Var.m6786a();
                } catch (h72 | IllegalArgumentException unused3) {
                    xy4.m12788q("Parsing RsaSsaPssPrivateKey failed");
                    return null;
                }
        }
    }

    @Override // p000.qe4
    public Object get() {
        throw new IllegalStateException();
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: h */
    public Object mo3681h(nr6 nr6Var) {
        boolean z;
        if (nr6Var.m8826j()) {
            C0809js c0809js = (C0809js) nr6Var.m8824h();
            ig1 ig1Var = ig1.f21399w;
            ig1Var.m6798m("Crashlytics report successfully enqueued to DataTransport: " + c0809js.f22550b, null);
            File file = c0809js.f22551c;
            if (file.delete()) {
                ig1Var.m6798m("Deleted report file: " + file.getPath(), null);
            } else {
                ig1Var.m6802q("Crashlytics could not delete report file: " + file.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", nr6Var.m8823g());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.y73
    /* JADX INFO: renamed from: i */
    public nh3 mo4674i(t73 t73Var) {
        rs3 rs3Var = (rs3) t73Var;
        id2 id2VarM7068B = jd2.m7068B();
        id2VarM7068B.m6763g("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        ms3 ms3VarM8837A = ns3.m8837A();
        ts3 ts3VarM12757c = xs3.m12757c(rs3Var);
        ms3VarM8837A.m9631e();
        ((ns3) ms3VarM8837A.f27912b).m8840D(ts3VarM12757c);
        int i = rs3Var.f29582a;
        ms3VarM8837A.m9631e();
        ((ns3) ms3VarM8837A.f27912b).m8839C(i);
        o50 o50VarM12756b = xs3.m12756b(rs3Var.f29583b);
        ms3VarM8837A.m9631e();
        ((ns3) ms3VarM8837A.f27912b).m8841E(o50VarM12756b);
        id2VarM7068B.m6764h(((ns3) ms3VarM8837A.m9628b()).m11693f());
        id2VarM7068B.m6762f((j63) xs3.f34596g.m8745L(rs3Var.f29584c));
        return nh3.m8734l((jd2) id2VarM7068B.m9628b());
    }

    @Override // p000.np4
    /* JADX INFO: renamed from: c */
    public void mo4671c(Exception exc) {
    }
}
