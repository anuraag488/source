package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ep2 {
    static {
        int i = dm3.CONFIG_NAME_FIELD_NUMBER;
        try {
            m5270a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5270a() {
        hp2 hp2Var = hp2.f20767a;
        iw2 iw2Var = iw2.f21844b;
        iw2Var.m6956b(hp2.f20767a);
        iw2Var.m6955a(hp2.f20768b);
        iw2Var.m6956b(l90.f23866a);
        int i = ww1.f33798f;
        if (!zi4.m13601a(i)) {
            xy4.m12788q("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        nh3 nh3Var = cx1.f16563a;
        nw2 nw2Var = nw2.f26151b;
        nw2Var.m8875e(cx1.f16565c);
        nw2Var.m8874d(cx1.f16566d);
        nw2Var.m8873c(cx1.f16567e);
        nw2Var.m8872b(cx1.f16568f);
        iw2Var.m6955a(ww1.f33793a);
        iw2Var.m6955a(ww1.f33794b);
        gw2 gw2Var = gw2.f20151b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", od3.f26641a);
        C1283w7 c1283w7M13829b = zw1.m13829b();
        c1283w7M13829b.f33126b = 32;
        c1283w7M13829b.f33127c = 16;
        yw1 yw1Var = yw1.f35564e;
        c1283w7M13829b.f33129e = yw1Var;
        xw1 xw1Var = xw1.f34661d;
        c1283w7M13829b.f33128d = xw1Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", c1283w7M13829b.m12145u());
        C1283w7 c1283w7M13829b2 = zw1.m13829b();
        c1283w7M13829b2.f33126b = 32;
        c1283w7M13829b2.f33127c = 32;
        yw1 yw1Var2 = yw1.f35561b;
        c1283w7M13829b2.f33129e = yw1Var2;
        c1283w7M13829b2.f33128d = xw1Var;
        map.put("HMAC_SHA256_256BITTAG", c1283w7M13829b2.m12145u());
        C1283w7 c1283w7M13829b3 = zw1.m13829b();
        c1283w7M13829b3.f33126b = 32;
        c1283w7M13829b3.f33127c = 32;
        c1283w7M13829b3.f33129e = yw1Var;
        c1283w7M13829b3.f33128d = xw1Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", c1283w7M13829b3.m12145u());
        C1283w7 c1283w7M13829b4 = zw1.m13829b();
        c1283w7M13829b4.f33126b = 64;
        c1283w7M13829b4.f33127c = 16;
        c1283w7M13829b4.f33129e = yw1Var2;
        xw1 xw1Var2 = xw1.f34663f;
        c1283w7M13829b4.f33128d = xw1Var2;
        map.put("HMAC_SHA512_128BITTAG", c1283w7M13829b4.m12145u());
        C1283w7 c1283w7M13829b5 = zw1.m13829b();
        c1283w7M13829b5.f33126b = 64;
        c1283w7M13829b5.f33127c = 16;
        c1283w7M13829b5.f33129e = yw1Var;
        c1283w7M13829b5.f33128d = xw1Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", c1283w7M13829b5.m12145u());
        C1283w7 c1283w7M13829b6 = zw1.m13829b();
        c1283w7M13829b6.f33126b = 64;
        c1283w7M13829b6.f33127c = 32;
        c1283w7M13829b6.f33129e = yw1Var2;
        c1283w7M13829b6.f33128d = xw1Var2;
        map.put("HMAC_SHA512_256BITTAG", c1283w7M13829b6.m12145u());
        C1283w7 c1283w7M13829b7 = zw1.m13829b();
        c1283w7M13829b7.f33126b = 64;
        c1283w7M13829b7.f33127c = 32;
        c1283w7M13829b7.f33129e = yw1Var;
        c1283w7M13829b7.f33128d = xw1Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", c1283w7M13829b7.m12145u());
        map.put("HMAC_SHA512_512BITTAG", od3.f26642b);
        C1283w7 c1283w7M13829b8 = zw1.m13829b();
        c1283w7M13829b8.f33126b = 64;
        c1283w7M13829b8.f33127c = 64;
        c1283w7M13829b8.f33129e = yw1Var;
        c1283w7M13829b8.f33128d = xw1Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", c1283w7M13829b8.m12145u());
        gw2Var.m6178b(Collections.unmodifiableMap(map));
        ov2 ov2Var = ov2.f27148b;
        ov2Var.m9312a(ww1.f33797e, zw1.class);
        pv2.f28028b.m9682a(ww1.f33796d, zw1.class);
        zc2 zc2Var = zc2.f35977d;
        zc2Var.m13504d(ww1.f33795c, i, true);
        if (cn4.m4052a()) {
            return;
        }
        C0518c8 c0518c8 = AbstractC0936n7.f25482a;
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Registering AES CMAC is not supported in FIPS mode");
            return;
        }
        nw2Var.m8875e(AbstractC1209u7.f31687a);
        nw2Var.m8874d(AbstractC1209u7.f31688b);
        nw2Var.m8873c(AbstractC1209u7.f31689c);
        nw2Var.m8872b(AbstractC1209u7.f31690d);
        ov2Var.m9312a(AbstractC0936n7.f25482a, C1024p7.class);
        iw2Var.m6955a(AbstractC0936n7.f25483b);
        iw2Var.m6955a(AbstractC0936n7.f25484c);
        HashMap map2 = new HashMap();
        C1024p7 c1024p7 = od3.f26643c;
        map2.put("AES_CMAC", c1024p7);
        map2.put("AES256_CMAC", c1024p7);
        jp0 jp0VarM9372b = C1024p7.m9372b();
        jp0VarM9372b.m7228R(32);
        jp0VarM9372b.m7231U(16);
        jp0VarM9372b.f22483d = C0973o7.f26380f;
        map2.put("AES256_CMAC_RAW", jp0VarM9372b.m7237f());
        gw2Var.m6178b(Collections.unmodifiableMap(map2));
        zc2Var.m13503c(AbstractC0936n7.f25485d, true);
    }
}
