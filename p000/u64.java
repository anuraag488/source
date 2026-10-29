package p000;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class u64 {
    static {
        int i = dm3.CONFIG_NAME_FIELD_NUMBER;
        try {
            m11264a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11264a() {
        di3 di3Var = di3.f17082a;
        iw2 iw2Var = iw2.f21844b;
        iw2Var.m6956b(di3.f17082a);
        iw2Var.m6955a(di3.f17083b);
        iw2Var.m6956b(hi3.f20601a);
        iw2Var.m6955a(hi3.f20602b);
        int i = w51.f33108f;
        if (!zi4.m13601a(i)) {
            xy4.m12788q("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        x73 x73Var = r51.f29020a;
        nw2 nw2Var = nw2.f26151b;
        nw2Var.m8875e(r51.f29020a);
        nw2Var.m8874d(r51.f29021b);
        nw2Var.m8873c(r51.f29022c);
        nw2Var.m8872b(r51.f29023d);
        nw2Var.m8873c(r51.f29024e);
        nw2Var.m8872b(r51.f29025f);
        gw2 gw2Var = gw2.f20151b;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", pd3.f27535a);
        map.put("ECDSA_P256_IEEE_P1363", pd3.f27538d);
        C1283w7 c1283w7M7834b = l51.m7834b();
        c1283w7M7834b.f33129e = C0973o7.f26390p;
        c1283w7M7834b.f33128d = k51.f22897c;
        c1283w7M7834b.f33127c = C0641f8.f18813n;
        c1283w7M7834b.f33126b = C0973o7.f26396v;
        map.put("ECDSA_P256_RAW", c1283w7M7834b.m12144q());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", pd3.f27540f);
        map.put("ECDSA_P384", pd3.f27536b);
        map.put("ECDSA_P384_IEEE_P1363", pd3.f27539e);
        C1283w7 c1283w7M7834b2 = l51.m7834b();
        c1283w7M7834b2.f33129e = C0973o7.f26392r;
        k51 k51Var = k51.f22898d;
        c1283w7M7834b2.f33128d = k51Var;
        C0641f8 c0641f8 = C0641f8.f18814o;
        c1283w7M7834b2.f33127c = c0641f8;
        C0973o7 c0973o7 = C0973o7.f26393s;
        c1283w7M7834b2.f33126b = c0973o7;
        map.put("ECDSA_P384_SHA512", c1283w7M7834b2.m12144q());
        C1283w7 c1283w7M7834b3 = l51.m7834b();
        c1283w7M7834b3.f33129e = C0973o7.f26391q;
        c1283w7M7834b3.f33128d = k51Var;
        c1283w7M7834b3.f33127c = c0641f8;
        c1283w7M7834b3.f33126b = c0973o7;
        map.put("ECDSA_P384_SHA384", c1283w7M7834b3.m12144q());
        map.put("ECDSA_P521", pd3.f27537c);
        map.put("ECDSA_P521_IEEE_P1363", pd3.f27541g);
        gw2Var.m6178b(Collections.unmodifiableMap(map));
        iw2Var.m6955a(w51.f33103a);
        iw2Var.m6955a(w51.f33104b);
        ov2 ov2Var = ov2.f27148b;
        ov2Var.m9312a(w51.f33107e, l51.class);
        zc2 zc2Var = zc2.f35977d;
        zc2Var.m13504d(w51.f33105c, i, true);
        zc2Var.m13504d(w51.f33106d, i, false);
        int i2 = js3.f22565f;
        if (!zi4.m13601a(i2)) {
            xy4.m12788q("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        nw2Var.m8875e(es3.f18431a);
        nw2Var.m8874d(es3.f18432b);
        nw2Var.m8873c(es3.f18433c);
        nw2Var.m8872b(es3.f18434d);
        nw2Var.m8873c(es3.f18435e);
        nw2Var.m8872b(es3.f18436f);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", pd3.f27542h);
        ur3 ur3VarM12753b = xr3.m12753b();
        ur3VarM12753b.f32119c = vr3.f32809b;
        ur3VarM12753b.f32117a = 3072;
        BigInteger bigInteger = xr3.f34563e;
        ur3VarM12753b.f32118b = bigInteger;
        wr3 wr3Var = wr3.f33661e;
        ur3VarM12753b.f32120d = wr3Var;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", ur3VarM12753b.m11635a());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", pd3.f27543i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", pd3.f27544j);
        ur3 ur3VarM12753b2 = xr3.m12753b();
        ur3VarM12753b2.f32119c = vr3.f32811d;
        ur3VarM12753b2.f32117a = 4096;
        ur3VarM12753b2.f32118b = bigInteger;
        ur3VarM12753b2.f32120d = wr3Var;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", ur3VarM12753b2.m11635a());
        gw2Var.m6178b(map2);
        iw2Var.m6955a(js3.f22560a);
        iw2Var.m6955a(js3.f22561b);
        ov2Var.m9312a(js3.f22564e, xr3.class);
        zc2Var.m13504d(js3.f22562c, i2, true);
        zc2Var.m13504d(js3.f22563d, i2, false);
        int i3 = ct3.f16464f;
        if (!zi4.m13601a(i3)) {
            xy4.m12788q("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        nw2Var.m8875e(xs3.f34590a);
        nw2Var.m8874d(xs3.f34591b);
        nw2Var.m8873c(xs3.f34592c);
        nw2Var.m8872b(xs3.f34593d);
        nw2Var.m8873c(xs3.f34594e);
        nw2Var.m8872b(xs3.f34595f);
        HashMap map3 = new HashMap();
        os3 os3VarM10422b = rs3.m10422b();
        ps3 ps3Var = ps3.f27947b;
        os3VarM10422b.f27059c = ps3Var;
        os3VarM10422b.f27060d = ps3Var;
        os3VarM10422b.m9257b(32);
        os3VarM10422b.f27057a = 3072;
        BigInteger bigInteger2 = rs3.f29581g;
        os3VarM10422b.f27058b = bigInteger2;
        qs3 qs3Var = qs3.f28761b;
        os3VarM10422b.f27062f = qs3Var;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", os3VarM10422b.m9256a());
        os3 os3VarM10422b2 = rs3.m10422b();
        os3VarM10422b2.f27059c = ps3Var;
        os3VarM10422b2.f27060d = ps3Var;
        os3VarM10422b2.m9257b(32);
        os3VarM10422b2.f27057a = 3072;
        os3VarM10422b2.f27058b = bigInteger2;
        qs3 qs3Var2 = qs3.f28764e;
        os3VarM10422b2.f27062f = qs3Var2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", os3VarM10422b2.m9256a());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", pd3.f27545k);
        os3 os3VarM10422b3 = rs3.m10422b();
        ps3 ps3Var2 = ps3.f27949d;
        os3VarM10422b3.f27059c = ps3Var2;
        os3VarM10422b3.f27060d = ps3Var2;
        os3VarM10422b3.m9257b(64);
        os3VarM10422b3.f27057a = 4096;
        os3VarM10422b3.f27058b = bigInteger2;
        os3VarM10422b3.f27062f = qs3Var;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", os3VarM10422b3.m9256a());
        os3 os3VarM10422b4 = rs3.m10422b();
        os3VarM10422b4.f27059c = ps3Var2;
        os3VarM10422b4.f27060d = ps3Var2;
        os3VarM10422b4.m9257b(64);
        os3VarM10422b4.f27057a = 4096;
        os3VarM10422b4.f27058b = bigInteger2;
        os3VarM10422b4.f27062f = qs3Var2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", os3VarM10422b4.m9256a());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", pd3.f27546l);
        gw2Var.m6178b(Collections.unmodifiableMap(map3));
        iw2Var.m6955a(ct3.f16459a);
        iw2Var.m6955a(ct3.f16460b);
        ov2Var.m9312a(ct3.f16463e, rs3.class);
        zc2Var.m13504d(ct3.f16461c, i3, true);
        zc2Var.m13504d(ct3.f16462d, i3, false);
        if (cn4.m4052a()) {
            return;
        }
        rf3 rf3Var = j61.f22038a;
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        nw2Var.m8875e(k61.f22932a);
        nw2Var.m8874d(k61.f22933b);
        nw2Var.m8873c(k61.f22934c);
        nw2Var.m8872b(k61.f22935d);
        nw2Var.m8873c(k61.f22936e);
        nw2Var.m8872b(k61.f22937f);
        HashMap map4 = new HashMap();
        map4.put("ED25519", f61.m5592b(e61.f17836b));
        e61 e61Var = e61.f17839e;
        map4.put("ED25519_RAW", f61.m5592b(e61Var));
        map4.put("ED25519WithRawOutput", f61.m5592b(e61Var));
        gw2Var.m6178b(Collections.unmodifiableMap(map4));
        ov2Var.m9312a(j61.f22043f, f61.class);
        pv2.f28028b.m9682a(j61.f22042e, f61.class);
        iw2Var.m6955a(j61.f22038a);
        iw2Var.m6955a(j61.f22039b);
        zc2Var.m13503c(j61.f22040c, true);
        zc2Var.m13503c(j61.f22041d, false);
    }
}
