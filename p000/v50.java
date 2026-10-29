package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v50 {

    /* JADX INFO: renamed from: c */
    public static final String f32409c;

    /* JADX INFO: renamed from: d */
    public static final Set f32410d;

    /* JADX INFO: renamed from: e */
    public static final v50 f32411e;

    /* JADX INFO: renamed from: f */
    public static final v50 f32412f;

    /* JADX INFO: renamed from: a */
    public final String f32413a;

    /* JADX INFO: renamed from: b */
    public final String f32414b;

    static {
        String strM4287B = d24.m4287B("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f32409c = strM4287B;
        String strM4287B2 = d24.m4287B("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM4287B3 = d24.m4287B("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f32410d = Collections.unmodifiableSet(new HashSet(Arrays.asList(j81.m7046a("proto"), j81.m7046a("json"))));
        f32411e = new v50(strM4287B, null);
        f32412f = new v50(strM4287B2, strM4287B3);
    }

    public v50(String str, String str2) {
        this.f32413a = str;
        this.f32414b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static v50 m11747a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            C1077qn.m9987m("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            C1077qn.m9987m("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            C1077qn.m9987m("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        return new v50(str2, str3.isEmpty() ? null : str3);
    }
}
