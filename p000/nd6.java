package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.lang.invoke.VarHandle;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nd6 extends ir5 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f25724e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mg6 f25725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd6(mg6 mg6Var, oc6 oc6Var, byte b) {
        super(oc6Var);
        this.f25724e = b;
        switch (b) {
            case 2:
                Objects.requireNonNull(mg6Var);
                this.f25725f = mg6Var;
                super(oc6Var);
                break;
            default:
                Objects.requireNonNull(mg6Var);
                this.f25725f = mg6Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175  */
    /* JADX WARN: Code duplicated, block: B:61:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x0189  */
    /* JADX WARN: Code duplicated, block: B:67:0x018c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0289 A[Catch: IllegalArgumentException | MalformedURLException -> 0x0290, TryCatch #3 {IllegalArgumentException | MalformedURLException -> 0x0290, blocks: (B:80:0x0241, B:82:0x0289, B:85:0x0292, B:87:0x0298, B:89:0x02a0, B:90:0x02a6, B:91:0x02aa), top: B:114:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0298 A[Catch: IllegalArgumentException | MalformedURLException -> 0x0290, TryCatch #3 {IllegalArgumentException | MalformedURLException -> 0x0290, blocks: (B:80:0x0241, B:82:0x0289, B:85:0x0292, B:87:0x0298, B:89:0x02a0, B:90:0x02a6, B:91:0x02aa), top: B:114:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02a0 A[Catch: IllegalArgumentException | MalformedURLException -> 0x0290, TryCatch #3 {IllegalArgumentException | MalformedURLException -> 0x0290, blocks: (B:80:0x0241, B:82:0x0289, B:85:0x0292, B:87:0x0298, B:89:0x02a0, B:90:0x02a6, B:91:0x02aa), top: B:114:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02c4  */
    @Override // p000.ir5
    /* JADX INFO: renamed from: a */
    public final void mo6922a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        oj6 oj6VarM9027n;
        oa6 oa6Var;
        s56 s56Var;
        bq5 bq5VarMo5567d;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        oa6 oa6Var2;
        URL url;
        String strConcat;
        byte b = this.f25724e;
        byte b2 = 0;
        mg6 mg6Var = this.f25725f;
        switch (b) {
            case 0:
                mg6 mg6Var2 = ((oa6) mg6Var.f36084a).f26521m;
                oa6.m9015k(mg6Var2);
                ld6 ld6Var = new ld6(b2);
                ld6Var.f23966b = mg6Var2;
                VarHandle.storeStoreFence();
                new Thread(ld6Var).start();
                break;
            case 1:
                mg6Var.m8319W();
                break;
            case 2:
                mg6Var.m8300A();
                break;
            default:
                oa6 oa6Var3 = (oa6) mg6Var.f36084a;
                s86 s86Var = oa6Var3.f26513e;
                d76 d76Var = oa6Var3.f26514f;
                ea6 ea6Var = oa6Var3.f26515g;
                oa6.m9016l(ea6Var);
                ea6Var.mo5038t();
                wg6 wg6Var = oa6Var3.f26523o;
                oa6.m9016l(wg6Var);
                oa6 oa6Var4 = (oa6) wg6Var.f36084a;
                oa6.m9016l(wg6Var);
                String strM4936A = oa6Var3.m9029p().m4936A();
                Boolean boolM9227G = oa6Var3.f26512d.m9227G("google_analytics_adid_collection_enabled");
                if (boolM9227G == null || boolM9227G.booleanValue()) {
                    oa6.m9014j(s86Var);
                    oa6 oa6Var5 = (oa6) s86Var.f36084a;
                    s86Var.mo5038t();
                    if (s86Var.m10556B().m12660i(vc6.AD_STORAGE)) {
                        oa6Var5.f26519k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = s86Var.f29990l;
                        if (str3 == null || jElapsedRealtime >= s86Var.f29992n) {
                            s86Var.f29992n = oa6Var5.f26512d.m9222B(strM4936A, e56.f17772b) + jElapsedRealtime;
                            try {
                                C0008a7 c0008a7M3471a = C0481b7.m3471a(oa6Var5.f26509a);
                                s86Var.f29990l = "";
                                String str4 = c0008a7M3471a.f144a;
                                if (str4 != null) {
                                    s86Var.f29990l = str4;
                                }
                                s86Var.f29991m = c0008a7M3471a.f145b;
                            } catch (Exception e) {
                                d76 d76Var2 = oa6Var5.f26514f;
                                oa6.m9016l(d76Var2);
                                d76Var2.f16842q.m12505b(e, "Unable to get advertising id");
                                s86Var.f29990l = "";
                            }
                            pair = new Pair(s86Var.f29990l, Boolean.valueOf(s86Var.f29991m));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(s86Var.f29991m));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        oa6.m9016l(wg6Var);
                        wg6Var.m7955v();
                        ConnectivityManager connectivityManager = (ConnectivityManager) oa6Var4.f26509a.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            oj6 oj6VarM9027n2 = oa6Var3.m9027n();
                            oj6VarM9027n2.mo5038t();
                            oj6VarM9027n2.m9741u();
                            if (!oj6VarM9027n2.m9133B()) {
                                mg6 mg6Var3 = oa6Var3.f26521m;
                                oa6.m9015k(mg6Var3);
                                oa6 oa6Var6 = (oa6) mg6Var3.f36084a;
                                mg6Var3.mo5038t();
                                oj6VarM9027n = oa6Var6.m9027n();
                                oa6Var = (oa6) oj6VarM9027n.f36084a;
                                oj6VarM9027n.mo5038t();
                                oj6VarM9027n.m9741u();
                                s56Var = oj6VarM9027n.f26789h;
                                if (s56Var == null) {
                                    oj6VarM9027n.m9132A();
                                    d76 d76Var3 = oa6Var.f26514f;
                                    oa6.m9016l(d76Var3);
                                    d76Var3.f16842q.m12504a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        bq5VarMo5567d = s56Var.mo5567d(oj6VarM9027n.m9142L(false));
                                        oj6VarM9027n.m9139I();
                                    } catch (RemoteException e2) {
                                        d76 d76Var4 = oa6Var.f26514f;
                                        oa6.m9016l(d76Var4);
                                        d76Var4.f16835j.m12505b(e2, "Failed to get consents; remote exception");
                                        bq5VarMo5567d = null;
                                    }
                                    if (bq5VarMo5567d != null) {
                                        bundle = bq5VarMo5567d.f15508d;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = oa6Var3.f26506B;
                                        oa6Var3.f26506B = i + 1;
                                        b2 = i < 10 ? (byte) 1 : (byte) 0;
                                        oa6.m9016l(d76Var);
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        d76Var.f16842q.m12505b(Integer.valueOf(oa6Var3.f26506B), c75.m3881m(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                    } else {
                                        xc6 xc6VarM12652b = xc6.m12652b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(xc6VarM12652b.m12658f());
                                        mr5 mr5VarM8387c = mr5.m8387c(100, bundle);
                                        str = mr5VarM8387c.f25174d;
                                        sb.append("&dma=");
                                        Boolean bool2 = mr5VarM8387c.f25173c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = xc6.m12654d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i2 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i2);
                                        oa6.m9016l(d76Var);
                                        d76Var.f16831L.m12505b(sb, "Consent query parameters to Bow");
                                        dn6 dn6Var = oa6Var3.f26517i;
                                        oa6.m9014j(dn6Var);
                                        ((oa6) oa6Var3.m9029p().f36084a).f26512d.m9235z();
                                        String str5 = (String) pair.first;
                                        long jM8623a = s86Var.f29980S.m8623a() - 1;
                                        string = sb.toString();
                                        oa6Var2 = (oa6) dn6Var.f36084a;
                                        try {
                                            y42.m12851X(str5);
                                            y42.m12851X(strM4936A);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v130000." + dn6Var.m4601a0()) + "&rdid=" + str5 + "&bundleid=" + strM4936A + "&retry=" + jM8623a;
                                            if (strM4936A.equals(oa6Var2.f26512d.m9234y("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException | MalformedURLException e3) {
                                            d76 d76Var5 = oa6Var2.f26514f;
                                            oa6.m9016l(d76Var5);
                                            d76Var5.f16835j.m12505b(e3.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            oa6.m9016l(wg6Var);
                                            bt5 bt5Var = new bt5((byte) 11);
                                            bt5Var.f15596b = oa6Var3;
                                            VarHandle.storeStoreFence();
                                            wg6Var.m7955v();
                                            ea6 ea6Var2 = oa6Var4.f26515g;
                                            oa6.m9016l(ea6Var2);
                                            ea6Var2.m5036G(new tq5(wg6Var, strM4936A, url, (byte[]) null, (HashMap) null, bt5Var));
                                        }
                                    }
                                }
                                bq5VarMo5567d = null;
                                if (bq5VarMo5567d != null) {
                                    bundle = bq5VarMo5567d.f15508d;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = oa6Var3.f26506B;
                                    oa6Var3.f26506B = i + 1;
                                    if (i < 10) {
                                    }
                                    oa6.m9016l(d76Var);
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    d76Var.f16842q.m12505b(Integer.valueOf(oa6Var3.f26506B), c75.m3881m(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                } else {
                                    xc6 xc6VarM12652b2 = xc6.m12652b(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(xc6VarM12652b2.m12658f());
                                    mr5 mr5VarM8387c2 = mr5.m8387c(100, bundle);
                                    str = mr5VarM8387c2.f25174d;
                                    sb.append("&dma=");
                                    Boolean bool3 = mr5VarM8387c2.f25173c;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = xc6.m12654d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i3 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i3);
                                    oa6.m9016l(d76Var);
                                    d76Var.f16831L.m12505b(sb, "Consent query parameters to Bow");
                                    dn6 dn6Var2 = oa6Var3.f26517i;
                                    oa6.m9014j(dn6Var2);
                                    ((oa6) oa6Var3.m9029p().f36084a).f26512d.m9235z();
                                    String str6 = (String) pair.first;
                                    long jM8623a2 = s86Var.f29980S.m8623a() - 1;
                                    string = sb.toString();
                                    oa6Var2 = (oa6) dn6Var2.f36084a;
                                    y42.m12851X(str6);
                                    y42.m12851X(strM4936A);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v130000." + dn6Var2.m4601a0()) + "&rdid=" + str6 + "&bundleid=" + strM4936A + "&retry=" + jM8623a2;
                                    if (strM4936A.equals(oa6Var2.f26512d.m9234y("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        oa6.m9016l(wg6Var);
                                        bt5 bt5Var2 = new bt5((byte) 11);
                                        bt5Var2.f15596b = oa6Var3;
                                        VarHandle.storeStoreFence();
                                        wg6Var.m7955v();
                                        ea6 ea6Var3 = oa6Var4.f26515g;
                                        oa6.m9016l(ea6Var3);
                                        ea6Var3.m5036G(new tq5(wg6Var, strM4936A, url, (byte[]) null, (HashMap) null, bt5Var2));
                                    }
                                }
                                break;
                            } else {
                                dn6 dn6Var3 = ((oa6) oj6VarM9027n2.f36084a).f26517i;
                                oa6.m9014j(dn6Var3);
                                if (dn6Var3.m4601a0() >= 234200) {
                                    mg6 mg6Var4 = oa6Var3.f26521m;
                                    oa6.m9015k(mg6Var4);
                                    oa6 oa6Var7 = (oa6) mg6Var4.f36084a;
                                    mg6Var4.mo5038t();
                                    oj6VarM9027n = oa6Var7.m9027n();
                                    oa6Var = (oa6) oj6VarM9027n.f36084a;
                                    oj6VarM9027n.mo5038t();
                                    oj6VarM9027n.m9741u();
                                    s56Var = oj6VarM9027n.f26789h;
                                    if (s56Var == null) {
                                        oj6VarM9027n.m9132A();
                                        d76 d76Var6 = oa6Var.f26514f;
                                        oa6.m9016l(d76Var6);
                                        d76Var6.f16842q.m12504a("Failed to get consents; not connected to service yet.");
                                    } else {
                                        bq5VarMo5567d = s56Var.mo5567d(oj6VarM9027n.m9142L(false));
                                        oj6VarM9027n.m9139I();
                                        if (bq5VarMo5567d != null) {
                                            bundle = bq5VarMo5567d.f15508d;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i = oa6Var3.f26506B;
                                            oa6Var3.f26506B = i + 1;
                                            if (i < 10) {
                                            }
                                            oa6.m9016l(d76Var);
                                            if (i < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            d76Var.f16842q.m12505b(Integer.valueOf(oa6Var3.f26506B), c75.m3881m(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                        } else {
                                            xc6 xc6VarM12652b3 = xc6.m12652b(100, bundle);
                                            sb.append("&gcs=");
                                            sb.append(xc6VarM12652b3.m12658f());
                                            mr5 mr5VarM8387c3 = mr5.m8387c(100, bundle);
                                            str = mr5VarM8387c3.f25174d;
                                            sb.append("&dma=");
                                            Boolean bool4 = mr5VarM8387c3.f25173c;
                                            bool = Boolean.FALSE;
                                            sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            iOrdinal = xc6.m12654d(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i4);
                                            oa6.m9016l(d76Var);
                                            d76Var.f16831L.m12505b(sb, "Consent query parameters to Bow");
                                            dn6 dn6Var4 = oa6Var3.f26517i;
                                            oa6.m9014j(dn6Var4);
                                            ((oa6) oa6Var3.m9029p().f36084a).f26512d.m9235z();
                                            String str7 = (String) pair.first;
                                            long jM8623a3 = s86Var.f29980S.m8623a() - 1;
                                            string = sb.toString();
                                            oa6Var2 = (oa6) dn6Var4.f36084a;
                                            y42.m12851X(str7);
                                            y42.m12851X(strM4936A);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v130000." + dn6Var4.m4601a0()) + "&rdid=" + str7 + "&bundleid=" + strM4936A + "&retry=" + jM8623a3;
                                            if (strM4936A.equals(oa6Var2.f26512d.m9234y("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                oa6.m9016l(wg6Var);
                                                bt5 bt5Var3 = new bt5((byte) 11);
                                                bt5Var3.f15596b = oa6Var3;
                                                VarHandle.storeStoreFence();
                                                wg6Var.m7955v();
                                                ea6 ea6Var4 = oa6Var4.f26515g;
                                                oa6.m9016l(ea6Var4);
                                                ea6Var4.m5036G(new tq5(wg6Var, strM4936A, url, (byte[]) null, (HashMap) null, bt5Var3));
                                            }
                                        }
                                    }
                                    bq5VarMo5567d = null;
                                    if (bq5VarMo5567d != null) {
                                        bundle = bq5VarMo5567d.f15508d;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = oa6Var3.f26506B;
                                        oa6Var3.f26506B = i + 1;
                                        if (i < 10) {
                                        }
                                        oa6.m9016l(d76Var);
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        d76Var.f16842q.m12505b(Integer.valueOf(oa6Var3.f26506B), c75.m3881m(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                    } else {
                                        xc6 xc6VarM12652b4 = xc6.m12652b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(xc6VarM12652b4.m12658f());
                                        mr5 mr5VarM8387c4 = mr5.m8387c(100, bundle);
                                        str = mr5VarM8387c4.f25174d;
                                        sb.append("&dma=");
                                        Boolean bool5 = mr5VarM8387c4.f25173c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = xc6.m12654d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i5);
                                        oa6.m9016l(d76Var);
                                        d76Var.f16831L.m12505b(sb, "Consent query parameters to Bow");
                                        dn6 dn6Var5 = oa6Var3.f26517i;
                                        oa6.m9014j(dn6Var5);
                                        ((oa6) oa6Var3.m9029p().f36084a).f26512d.m9235z();
                                        String str8 = (String) pair.first;
                                        long jM8623a4 = s86Var.f29980S.m8623a() - 1;
                                        string = sb.toString();
                                        oa6Var2 = (oa6) dn6Var5.f36084a;
                                        y42.m12851X(str8);
                                        y42.m12851X(strM4936A);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v130000." + dn6Var5.m4601a0()) + "&rdid=" + str8 + "&bundleid=" + strM4936A + "&retry=" + jM8623a4;
                                        if (strM4936A.equals(oa6Var2.f26512d.m9234y("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            oa6.m9016l(wg6Var);
                                            bt5 bt5Var4 = new bt5((byte) 11);
                                            bt5Var4.f15596b = oa6Var3;
                                            VarHandle.storeStoreFence();
                                            wg6Var.m7955v();
                                            ea6 ea6Var5 = oa6Var4.f26515g;
                                            oa6.m9016l(ea6Var5);
                                            ea6Var5.m5036G(new tq5(wg6Var, strM4936A, url, (byte[]) null, (HashMap) null, bt5Var4));
                                        }
                                    }
                                } else {
                                    dn6 dn6Var6 = oa6Var3.f26517i;
                                    oa6.m9014j(dn6Var6);
                                    ((oa6) oa6Var3.m9029p().f36084a).f26512d.m9235z();
                                    String str9 = (String) pair.first;
                                    long jM8623a5 = s86Var.f29980S.m8623a() - 1;
                                    string = sb.toString();
                                    oa6Var2 = (oa6) dn6Var6.f36084a;
                                    y42.m12851X(str9);
                                    y42.m12851X(strM4936A);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v130000." + dn6Var6.m4601a0()) + "&rdid=" + str9 + "&bundleid=" + strM4936A + "&retry=" + jM8623a5;
                                    if (strM4936A.equals(oa6Var2.f26512d.m9234y("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        oa6.m9016l(wg6Var);
                                        bt5 bt5Var5 = new bt5((byte) 11);
                                        bt5Var5.f15596b = oa6Var3;
                                        VarHandle.storeStoreFence();
                                        wg6Var.m7955v();
                                        ea6 ea6Var6 = oa6Var4.f26515g;
                                        oa6.m9016l(ea6Var6);
                                        ea6Var6.m5036G(new tq5(wg6Var, strM4936A, url, (byte[]) null, (HashMap) null, bt5Var5));
                                    }
                                }
                            }
                        } else {
                            oa6.m9016l(d76Var);
                            d76Var.f16838m.m12504a("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        oa6.m9016l(d76Var);
                        d76Var.f16831L.m12504a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    oa6.m9016l(d76Var);
                    d76Var.f16831L.m12504a("ADID collection is disabled from Manifest. Skipping");
                }
                if (b2 != 0) {
                    mg6Var.f24894R.m6923b(2000L);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nd6(mg6 mg6Var, oc6 oc6Var, byte b, boolean z) {
        super(oc6Var);
        this.f25724e = b;
        this.f25725f = mg6Var;
    }
}
