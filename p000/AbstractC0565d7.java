package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: d7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0565d7 {
    static {
        int i = dm3.CONFIG_NAME_FIELD_NUMBER;
        try {
            m4392a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4392a() throws GeneralSecurityException {
        C0715h7 c0715h7 = C0715h7.f20411a;
        iw2 iw2Var = iw2.f21844b;
        iw2Var.m6956b(C0715h7.f20411a);
        iw2Var.m6955a(C0715h7.f20412b);
        ep2.m5270a();
        int i = AbstractC0566d8.f16847e;
        if (!zi4.m13601a(i)) {
            xy4.m12788q("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        x73 x73Var = AbstractC0716h8.f20419a;
        nw2 nw2Var = nw2.f26151b;
        nw2Var.m8875e(AbstractC0716h8.f20419a);
        nw2Var.m8874d(AbstractC0716h8.f20420b);
        nw2Var.m8873c(AbstractC0716h8.f20421c);
        nw2Var.m8872b(AbstractC0716h8.f20422d);
        iw2Var.m6955a(AbstractC0566d8.f16843a);
        gw2 gw2Var = gw2.f20151b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", nd3.f25716e);
        C0602e8 c0602e8M5914b = C0679g8.m5914b();
        c0602e8M5914b.m4955s(16);
        c0602e8M5914b.m4956t(32);
        c0602e8M5914b.m4958v(16);
        c0602e8M5914b.m4957u(16);
        C0641f8 c0641f8 = C0641f8.f18804e;
        c0602e8M5914b.f17871e = c0641f8;
        C0973o7 c0973o7 = C0973o7.f26383i;
        c0602e8M5914b.f17872f = c0973o7;
        map.put("AES128_CTR_HMAC_SHA256_RAW", c0602e8M5914b.m4950k());
        map.put("AES256_CTR_HMAC_SHA256", nd3.f25717f);
        C0602e8 c0602e8M5914b2 = C0679g8.m5914b();
        c0602e8M5914b2.m4955s(32);
        c0602e8M5914b2.m4956t(32);
        c0602e8M5914b2.m4958v(32);
        c0602e8M5914b2.m4957u(16);
        c0602e8M5914b2.f17871e = c0641f8;
        c0602e8M5914b2.f17872f = c0973o7;
        map.put("AES256_CTR_HMAC_SHA256_RAW", c0602e8M5914b2.m4950k());
        gw2Var.m6178b(Collections.unmodifiableMap(map));
        pv2 pv2Var = pv2.f28028b;
        pv2Var.m9682a(AbstractC0566d8.f16845c, C0679g8.class);
        ov2 ov2Var = ov2.f27148b;
        ov2Var.m9312a(AbstractC0566d8.f16846d, C0679g8.class);
        zc2 zc2Var = zc2.f35977d;
        zc2Var.m13504d(AbstractC0566d8.f16844b, i, true);
        int i2 = AbstractC0717h9.f20443e;
        if (!zi4.m13601a(i2)) {
            xy4.m12788q("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        nw2Var.m8875e(AbstractC0790j9.f22104a);
        nw2Var.m8874d(AbstractC0790j9.f22105b);
        nw2Var.m8873c(AbstractC0790j9.f22106c);
        nw2Var.m8872b(AbstractC0790j9.f22107d);
        iw2Var.m6955a(AbstractC0717h9.f20439a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", nd3.f25712a);
        C1283w7 c1283w7M6697b = C0754i9.m6697b();
        c1283w7M6697b.m12126M();
        c1283w7M6697b.m12128O(16);
        c1283w7M6697b.m12130Q();
        C0973o7 c0973o8 = C0973o7.f26386l;
        c1283w7M6697b.f33129e = c0973o8;
        map2.put("AES128_GCM_RAW", c1283w7M6697b.m12142n());
        map2.put("AES256_GCM", nd3.f25713b);
        C1283w7 c1283w7M6697b2 = C0754i9.m6697b();
        c1283w7M6697b2.m12126M();
        c1283w7M6697b2.m12128O(32);
        c1283w7M6697b2.m12130Q();
        c1283w7M6697b2.f33129e = c0973o8;
        map2.put("AES256_GCM_RAW", c1283w7M6697b2.m12142n());
        gw2Var.m6178b(Collections.unmodifiableMap(map2));
        pv2Var.m9682a(AbstractC0717h9.f20441c, C0754i9.class);
        ov2Var.m9312a(AbstractC0717h9.f20442d, C0754i9.class);
        zc2Var.m13504d(AbstractC0717h9.f20440b, i2, true);
        if (cn4.m4052a()) {
            return;
        }
        rf3 rf3Var = AbstractC1284w8.f33147a;
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Registering AES EAX is not supported in FIPS mode");
            return;
        }
        nw2Var.m8875e(AbstractC0010a9.f171a);
        nw2Var.m8874d(AbstractC0010a9.f172b);
        nw2Var.m8873c(AbstractC0010a9.f173c);
        nw2Var.m8872b(AbstractC0010a9.f174d);
        iw2Var.m6955a(AbstractC1284w8.f33147a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", nd3.f25714c);
        C1283w7 c1283w7M12527b = C1322x8.m12527b();
        c1283w7M12527b.m12127N(16);
        c1283w7M12527b.m12128O(16);
        c1283w7M12527b.m12130Q();
        C0641f8 c0641f9 = C0641f8.f18809j;
        c1283w7M12527b.f33129e = c0641f9;
        map3.put("AES128_EAX_RAW", c1283w7M12527b.m12141m());
        map3.put("AES256_EAX", nd3.f25715d);
        C1283w7 c1283w7M12527b2 = C1322x8.m12527b();
        c1283w7M12527b2.m12127N(16);
        c1283w7M12527b2.m12128O(32);
        c1283w7M12527b2.m12130Q();
        c1283w7M12527b2.f33129e = c0641f9;
        map3.put("AES256_EAX_RAW", c1283w7M12527b2.m12141m());
        gw2Var.m6178b(Collections.unmodifiableMap(map3));
        ov2Var.m9312a(AbstractC1284w8.f33149c, C1322x8.class);
        zc2Var.m13503c(AbstractC1284w8.f33148b, true);
        rf3 rf3Var2 = AbstractC1100r9.f29096a;
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Registering AES GCM SIV is not supported in FIPS mode");
            return;
        }
        nw2Var.m8875e(AbstractC1174t9.f31002a);
        nw2Var.m8874d(AbstractC1174t9.f31003b);
        nw2Var.m8873c(AbstractC1174t9.f31004c);
        nw2Var.m8872b(AbstractC1174t9.f31005d);
        HashMap map4 = new HashMap();
        nh3 nh3VarM10562b = C1137s9.m10562b();
        nh3VarM10562b.m8744K(16);
        C0641f8 c0641f10 = C0641f8.f18810k;
        nh3VarM10562b.f25811c = c0641f10;
        map4.put("AES128_GCM_SIV", nh3VarM10562b.m8749g());
        nh3 nh3VarM10562b2 = C1137s9.m10562b();
        nh3VarM10562b2.m8744K(16);
        C0641f8 c0641f11 = C0641f8.f18812m;
        nh3VarM10562b2.f25811c = c0641f11;
        map4.put("AES128_GCM_SIV_RAW", nh3VarM10562b2.m8749g());
        nh3 nh3VarM10562b3 = C1137s9.m10562b();
        nh3VarM10562b3.m8744K(32);
        nh3VarM10562b3.f25811c = c0641f10;
        map4.put("AES256_GCM_SIV", nh3VarM10562b3.m8749g());
        nh3 nh3VarM10562b4 = C1137s9.m10562b();
        nh3VarM10562b4.m8744K(32);
        nh3VarM10562b4.f25811c = c0641f11;
        map4.put("AES256_GCM_SIV_RAW", nh3VarM10562b4.m8749g());
        gw2Var.m6178b(Collections.unmodifiableMap(map4));
        pv2Var.m9682a(AbstractC1100r9.f29098c, C1137s9.class);
        ov2Var.m9312a(AbstractC1100r9.f29097b, C1137s9.class);
        iw2Var.m6955a(AbstractC1100r9.f29096a);
        zc2Var.m13503c(AbstractC1100r9.f29099d, true);
        rf3 rf3Var3 = u70.f31691a;
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Registering ChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        nw2Var.m8875e(w70.f33130a);
        nw2Var.m8874d(w70.f33131b);
        nw2Var.m8873c(w70.f33132c);
        nw2Var.m8872b(w70.f33133d);
        iw2Var.m6955a(u70.f31691a);
        ov2Var.m9312a(u70.f31692b, v70.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", v70.m11755b(C0973o7.f26387m));
        map5.put("CHACHA20_POLY1305_RAW", v70.m11755b(C0973o7.f26389o));
        gw2Var.m6178b(Collections.unmodifiableMap(map5));
        zc2Var.m13503c(u70.f31693c, true);
        rf3 rf3Var4 = he2.f20513a;
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Registering KMS AEAD is not supported in FIPS mode");
            return;
        }
        nw2Var.m8875e(kj2.f23166a);
        nw2Var.m8874d(kj2.f23167b);
        nw2Var.m8873c(kj2.f23168c);
        nw2Var.m8872b(kj2.f23169d);
        iw2Var.m6955a(he2.f20513a);
        ov2Var.m9312a(he2.f20515c, jj2.class);
        zc2Var.m13503c(he2.f20514b, true);
        hj2 hj2Var = ne2.f25730a;
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Registering KMS Envelope AEAD is not supported in FIPS mode");
            return;
        }
        nw2Var.m8875e(nj2.f25885a);
        nw2Var.m8874d(nj2.f25886b);
        nw2Var.m8873c(nj2.f25887c);
        nw2Var.m8872b(nj2.f25888d);
        ov2Var.m9312a(ne2.f25731b, mj2.class);
        iw2Var.m6955a(ne2.f25732c);
        zc2Var.m13503c(ne2.f25730a, true);
        rf3 rf3Var5 = h45.f20388a;
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Registering XChaCha20Poly1305 is not supported in FIPS mode");
            return;
        }
        nw2Var.m8875e(j45.f22014a);
        nw2Var.m8874d(j45.f22015b);
        nw2Var.m8873c(j45.f22016c);
        nw2Var.m8872b(j45.f22017d);
        iw2Var.m6955a(h45.f20388a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", i45.m6664b(C0973o7.f26374A));
        map6.put("XCHACHA20_POLY1305_RAW", i45.m6664b(C0973o7.f26376C));
        gw2Var.m6178b(Collections.unmodifiableMap(map6));
        ov2Var.m9312a(h45.f20391d, i45.class);
        pv2Var.m9682a(h45.f20390c, i45.class);
        zc2Var.m13503c(h45.f20389b, true);
        C0518c8 c0518c8 = y35.f34842a;
        nw2Var.m8875e(c45.f15802a);
        nw2Var.m8874d(c45.f15803b);
        nw2Var.m8873c(c45.f15804c);
        nw2Var.m8872b(c45.f15805d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", nd3.f25718g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", nd3.f25719h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", nd3.f25720i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", nd3.f25721j);
        gw2Var.m6178b(Collections.unmodifiableMap(map7));
        iw2Var.m6955a(y35.f34843b);
        ov2Var.m9312a(y35.f34842a, z35.class);
    }
}
