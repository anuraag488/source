package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q76 extends rl6 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ byte f28266h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q76(qm6 qm6Var, byte b) {
        super(qm6Var);
        this.f28266h = b;
    }

    /* JADX INFO: renamed from: A */
    public static final void m9759A(l96 l96Var, String str, Long l) {
        List listM7876h = l96Var.m7876h();
        int i = 0;
        while (true) {
            if (i >= listM7876h.size()) {
                i = -1;
                break;
            } else if (str.equals(((x96) listM7876h.get(i)).m12547p())) {
                break;
            } else {
                i++;
            }
        }
        u96 u96VarM12535A = x96.m12535A();
        u96VarM12535A.m11305h(str);
        u96VarM12535A.m11307j(l.longValue());
        if (i < 0) {
            l96Var.m7879k(u96VarM12535A);
        } else {
            l96Var.m11054c();
            ((m96) l96Var.f31181b).m8254z(i, (x96) u96VarM12535A.m11056e());
        }
    }

    /* JADX INFO: renamed from: B */
    public static final Bundle m9760B(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x96 x96Var = (x96) it.next();
            String strM12547p = x96Var.m12547p();
            if (x96Var.m12554w()) {
                bundle.putDouble(strM12547p, x96Var.m12555x());
            } else if (x96Var.m12552u()) {
                bundle.putFloat(strM12547p, x96Var.m12553v());
            } else if (x96Var.m12548q()) {
                bundle.putString(strM12547p, x96Var.m12549r());
            } else if (x96Var.m12550s()) {
                bundle.putLong(strM12547p, x96Var.m12551t());
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: C */
    public static final x96 m9761C(String str, m96 m96Var) {
        for (x96 x96Var : m96Var.m8244o()) {
            if (x96Var.m12547p().equals(str)) {
                return x96Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static final Serializable m9762D(String str, m96 m96Var) {
        x96 x96VarM9761C = m9761C(str, m96Var);
        if (x96VarM9761C == null) {
            return null;
        }
        return m9766J(x96VarM9761C);
    }

    /* JADX INFO: renamed from: G */
    public static final void m9763G(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m9764H(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* JADX INFO: renamed from: I */
    public static final String m9765I(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    /* JADX INFO: renamed from: J */
    public static final Serializable m9766J(x96 x96Var) {
        if (x96Var.m12548q()) {
            return x96Var.m12549r();
        }
        if (x96Var.m12550s()) {
            return Long.valueOf(x96Var.m12551t());
        }
        if (x96Var.m12554w()) {
            return Double.valueOf(x96Var.m12555x());
        }
        if (x96Var.m12557z() > 0) {
            return m9779m0((mi6) x96Var.m12556y());
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static final void m9767K(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m9764H(builder, str3, string, set);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static final void m9768L(StringBuilder sb, String str, cb6 cb6Var) {
        if (cb6Var == null) {
            return;
        }
        m9763G(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (cb6Var.m3965r() != 0) {
            m9763G(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : cb6Var.m3964q()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (cb6Var.m3963p() != 0) {
            m9763G(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : cb6Var.m3962o()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (cb6Var.m3967t() != 0) {
            m9763G(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (j96 j96Var : cb6Var.m3966s()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(j96Var.m7056o() ? Integer.valueOf(j96Var.m7057p()) : null);
                sb.append(":");
                sb.append(j96Var.m7058q() ? Long.valueOf(j96Var.m7059r()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (cb6Var.m3969v() != 0) {
            m9763G(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (fb6 fb6Var : cb6Var.m3968u()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(fb6Var.m5631o() ? Integer.valueOf(fb6Var.m5632p()) : null);
                sb.append(": [");
                Iterator it = fb6Var.m5633q().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        m9763G(3, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: M */
    public static final void m9769M(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m9763G(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: renamed from: N */
    public static final void m9770N(StringBuilder sb, int i, String str, o46 o46Var) {
        String str2;
        if (o46Var == null) {
            return;
        }
        m9763G(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (o46Var.m8944o()) {
            int iM8953y = o46Var.m8953y();
            if (iM8953y == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iM8953y == 2) {
                str2 = "LESS_THAN";
            } else if (iM8953y != 3) {
                str2 = iM8953y != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            m9769M(sb, i, "comparison_type", str2);
        }
        if (o46Var.m8945p()) {
            m9769M(sb, i, "match_as_float", Boolean.valueOf(o46Var.m8946q()));
        }
        if (o46Var.m8947r()) {
            m9769M(sb, i, "comparison_value", o46Var.m8948s());
        }
        if (o46Var.m8949t()) {
            m9769M(sb, i, "min_comparison_value", o46Var.m8950u());
        }
        if (o46Var.m8951v()) {
            m9769M(sb, i, "max_comparison_value", o46Var.m8952w());
        }
        m9763G(i, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m9774d0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m9775e0(li6 li6Var, int i) {
        if (i < li6Var.size() * 64) {
            return ((1 << (i % 64)) & ((Long) li6Var.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public static ArrayList m9776f0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k0 */
    public static th6 m9777k0(th6 th6Var, byte[] bArr) throws qi6 {
        ah6 ah6VarM9093R;
        ah6 ah6Var = ah6.f14512a;
        if (ah6Var == null) {
            synchronized (ah6.class) {
                try {
                    ah6VarM9093R = ah6.f14512a;
                    if (ah6VarM9093R == null) {
                        bk6 bk6Var = bk6.f15375c;
                        ah6VarM9093R = oh6.m9093R();
                        ah6.f14512a = ah6VarM9093R;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ah6Var = ah6VarM9093R;
        }
        if (ah6Var != null) {
            th6Var.getClass();
            th6Var.m11058g(bArr, bArr.length, ah6Var);
            return th6Var;
        }
        th6Var.getClass();
        int length = bArr.length;
        ah6 ah6Var2 = ah6.f14512a;
        bk6 bk6Var2 = bk6.f15375c;
        th6Var.m11058g(bArr, length, ah6.f14513b);
        return th6Var;
    }

    /* JADX INFO: renamed from: l0 */
    public static int m9778l0(String str, qa6 qa6Var) {
        for (int i = 0; i < ((ua6) qa6Var.f31181b).m11430U1(); i++) {
            if (str.equals(((ua6) qa6Var.f31181b).m11433V1(i).m9482q())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m0 */
    public static Bundle[] m9779m0(mi6 mi6Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = mi6Var.iterator();
        while (it.hasNext()) {
            x96 x96Var = (x96) it.next();
            if (x96Var != null) {
                Bundle bundle = new Bundle();
                for (x96 x96Var2 : x96Var.m12556y()) {
                    if (x96Var2.m12548q()) {
                        bundle.putString(x96Var2.m12547p(), x96Var2.m12549r());
                    } else if (x96Var2.m12550s()) {
                        bundle.putLong(x96Var2.m12547p(), x96Var2.m12551t());
                    } else if (x96Var2.m12554w()) {
                        bundle.putDouble(x96Var2.m12547p(), x96Var2.m12555x());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: n0 */
    public static HashMap m9780n0(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(m9780n0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m9780n0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m9780n0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: y */
    public static ys5 m9781y(en5 en5Var) {
        Object obj;
        Bundle bundleM9782z = m9782z(en5Var.f18281c, true);
        String string = (!bundleM9782z.containsKey("_o") || (obj = bundleM9782z.get("_o")) == null) ? "app" : obj.toString();
        String strM6960c = iw5.m6960c(en5Var.f18279a, vd6.f32543f, vd6.f32545h);
        if (strM6960c == null) {
            strM6960c = en5Var.f18279a;
        }
        return new ys5(strM6960c, new os5(bundleM9782z), string, en5Var.f18280b);
    }

    /* JADX INFO: renamed from: z */
    public static Bundle m9782z(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(m9782z((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: E */
    public void m9783E(StringBuilder sb, int i, mi6 mi6Var) {
        if (mi6Var == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = mi6Var.iterator();
        while (it.hasNext()) {
            x96 x96Var = (x96) it.next();
            if (x96Var != null) {
                m9763G(i2, sb);
                sb.append("param {\n");
                m9769M(sb, i2, "name", x96Var.m12546o() ? ((oa6) this.f36084a).f26518j.m9367b(x96Var.m12547p()) : null);
                m9769M(sb, i2, "string_value", x96Var.m12548q() ? x96Var.m12549r() : null);
                m9769M(sb, i2, "int_value", x96Var.m12550s() ? Long.valueOf(x96Var.m12551t()) : null);
                m9769M(sb, i2, "double_value", x96Var.m12554w() ? Double.valueOf(x96Var.m12555x()) : null);
                if (x96Var.m12557z() > 0) {
                    m9783E(sb, i2, (mi6) x96Var.m12556y());
                }
                m9763G(i2, sb);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m9784F(StringBuilder sb, int i, j46 j46Var) {
        String str;
        if (j46Var == null) {
            return;
        }
        m9763G(i, sb);
        sb.append("filter {\n");
        if (j46Var.m7008s()) {
            m9769M(sb, i, "complement", Boolean.valueOf(j46Var.m7009t()));
        }
        if (j46Var.m7010u()) {
            m9769M(sb, i, "param_name", ((oa6) this.f36084a).f26518j.m9367b(j46Var.m7011v()));
        }
        if (j46Var.m7004o()) {
            int i2 = i + 1;
            w46 w46VarM7005p = j46Var.m7005p();
            if (w46VarM7005p != null) {
                m9763G(i2, sb);
                sb.append("string_filter {\n");
                if (w46VarM7005p.m12097o()) {
                    switch (w46VarM7005p.m12104w()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m9769M(sb, i2, "match_type", str);
                }
                if (w46VarM7005p.m12098p()) {
                    m9769M(sb, i2, "expression", w46VarM7005p.m12099q());
                }
                if (w46VarM7005p.m12100r()) {
                    m9769M(sb, i2, "case_sensitive", Boolean.valueOf(w46VarM7005p.m12101s()));
                }
                if (w46VarM7005p.m12103u() > 0) {
                    m9763G(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : w46VarM7005p.m12102t()) {
                        m9763G(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m9763G(i2, sb);
                sb.append("}\n");
            }
        }
        if (j46Var.m7006q()) {
            m9770N(sb, i + 1, "number_filter", j46Var.m7007r());
        }
        m9763G(i, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: O */
    public boolean m9785O() {
        m10368u();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((oa6) this.f36084a).f26509a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: V */
    public void m9786V(String str, sl6 sl6Var, pa6 pa6Var, k76 k76Var) {
        String str2;
        String str3 = sl6Var.f30378a;
        oa6 oa6Var = (oa6) this.f36084a;
        mo5038t();
        m10368u();
        try {
            URL url = new URI(str3).toURL();
            this.f19870f.m9958i0();
            byte[] bArrM5118a = pa6Var.m5118a();
            ea6 ea6Var = oa6Var.f26515g;
            oa6.m9016l(ea6Var);
            Map map = sl6Var.f30379b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                ea6Var.m5036G(new tq5(this, str2, url, bArrM5118a, map, k76Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16835j.m12506c("Failed to parse URL. Not uploading MeasurementBatch. appId", d76.m4401y(str2), str3);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: W */
    public void m9787W(ob6 ob6Var, Object obj) {
        ob6Var.m11054c();
        ((pb6) ob6Var.f31181b).m9475D();
        ob6Var.m11054c();
        ((pb6) ob6Var.f31181b).m9477F();
        ob6Var.m11054c();
        ((pb6) ob6Var.f31181b).m9479H();
        if (obj instanceof String) {
            ob6Var.m11054c();
            ((pb6) ob6Var.f31181b).m9474C((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            ob6Var.m11054c();
            ((pb6) ob6Var.f31181b).m9476E(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            ob6Var.m11054c();
            ((pb6) ob6Var.f31181b).m9478G(dDoubleValue);
        } else {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12505b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    /* JADX INFO: renamed from: X */
    public void m9788X(u96 u96Var, Object obj) {
        u96Var.m11054c();
        ((x96) u96Var.f31181b).m12538D();
        u96Var.m11054c();
        ((x96) u96Var.f31181b).m12540F();
        u96Var.m11054c();
        ((x96) u96Var.f31181b).m12542H();
        u96Var.m11054c();
        ((x96) u96Var.f31181b).m12545K();
        if (obj instanceof String) {
            u96Var.m11306i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            u96Var.m11307j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            u96Var.m11054c();
            ((x96) u96Var.f31181b).m12541G(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12505b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                u96 u96VarM12535A = x96.m12535A();
                for (String str : bundle.keySet()) {
                    u96 u96VarM12535A2 = x96.m12535A();
                    u96VarM12535A2.m11305h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        u96VarM12535A2.m11307j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        u96VarM12535A2.m11306i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        u96VarM12535A2.m11054c();
                        ((x96) u96VarM12535A2.f31181b).m12541G(dDoubleValue2);
                    }
                    u96VarM12535A.m11054c();
                    ((x96) u96VarM12535A.f31181b).m12543I((x96) u96VarM12535A2.m11056e());
                }
                if (((x96) u96VarM12535A.f31181b).m12557z() > 0) {
                    arrayList.add((x96) u96VarM12535A.m11056e());
                }
            }
        }
        u96Var.m11054c();
        ((x96) u96Var.f31181b).m12544J(arrayList);
    }

    /* JADX INFO: renamed from: Y */
    public cl6 m9789Y(String str, qa6 qa6Var, l96 l96Var, String str2) {
        int iIndexOf;
        ho6.m6466a();
        oa6 oa6Var = (oa6) this.f36084a;
        op5 op5Var = oa6Var.f26512d;
        if (!op5Var.m9225E(str, e56.f17748P0)) {
            return null;
        }
        oa6Var.f26519k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Set setOf = Set.of((Object[]) op5Var.m9221A(str, e56.f17820u0).split(","));
        qm6 qm6Var = this.f19870f;
        vl6 vl6Var = qm6Var.f28600j;
        n96 n96Var = qm6Var.f28591a;
        n96 n96Var2 = vl6Var.f19870f.f28591a;
        qm6.m9925S(n96Var2);
        String strM8643H = n96Var2.m8643H(str);
        Uri.Builder builder = new Uri.Builder();
        op5 op5Var2 = ((oa6) vl6Var.f36084a).f26512d;
        builder.scheme(op5Var2.m9221A(str, e56.f17806n0));
        if (TextUtils.isEmpty(strM8643H)) {
            builder.authority(op5Var2.m9221A(str, e56.f17808o0));
        } else {
            String strM9221A = op5Var2.m9221A(str, e56.f17808o0);
            StringBuilder sb = new StringBuilder(String.valueOf(strM8643H).length() + 1 + String.valueOf(strM9221A).length());
            sb.append(strM8643H);
            sb.append(".");
            sb.append(strM9221A);
            builder.authority(sb.toString());
        }
        builder.path(op5Var2.m9221A(str, e56.f17810p0));
        m9764H(builder, "gmp_app_id", ((ua6) qa6Var.f31181b).m11379D(), setOf);
        op5Var.m9235z();
        m9764H(builder, "gmp_version", String.valueOf(130000L), setOf);
        String strM11514x = ((ua6) qa6Var.f31181b).m11514x();
        d56 d56Var = e56.f17754S0;
        if (op5Var.m9225E(str, d56Var)) {
            qm6.m9925S(n96Var);
            if (n96Var.m8649N(str)) {
                strM11514x = "";
            }
        }
        m9764H(builder, "app_instance_id", strM11514x, setOf);
        m9764H(builder, "rdid", ((ua6) qa6Var.f31181b).m11505u(), setOf);
        m9764H(builder, "bundle_id", qa6Var.m9848o(), setOf);
        String strM7880l = l96Var.m7880l();
        String strM6960c = iw5.m6960c(strM7880l, vd6.f32545h, vd6.f32543f);
        if (true != TextUtils.isEmpty(strM6960c)) {
            strM7880l = strM6960c;
        }
        m9764H(builder, "app_event_name", strM7880l, setOf);
        m9764H(builder, "app_version", String.valueOf(((ua6) qa6Var.f31181b).m11397J()), setOf);
        String strM11469h2 = ((ua6) qa6Var.f31181b).m11469h2();
        if (op5Var.m9225E(str, d56Var)) {
            qm6.m9925S(n96Var);
            if (n96Var.m8648M(str) && !TextUtils.isEmpty(strM11469h2) && (iIndexOf = strM11469h2.indexOf(".")) != -1) {
                strM11469h2 = strM11469h2.substring(0, iIndexOf);
            }
        }
        m9764H(builder, "os_version", strM11469h2, setOf);
        m9764H(builder, "timestamp", String.valueOf(l96Var.m7881m()), setOf);
        if (((ua6) qa6Var.f31181b).m11511w()) {
            m9764H(builder, "lat", "1", setOf);
        }
        m9764H(builder, "privacy_sandbox_version", String.valueOf(((ua6) qa6Var.f31181b).m11386F0()), setOf);
        m9764H(builder, "trigger_uri_source", "1", setOf);
        m9764H(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setOf);
        m9764H(builder, "request_uuid", str2, setOf);
        List<x96> listM7876h = l96Var.m7876h();
        Bundle bundle = new Bundle();
        for (x96 x96Var : listM7876h) {
            String strM12547p = x96Var.m12547p();
            if (x96Var.m12554w()) {
                bundle.putString(strM12547p, String.valueOf(x96Var.m12555x()));
            } else if (x96Var.m12552u()) {
                bundle.putString(strM12547p, String.valueOf(x96Var.m12553v()));
            } else if (x96Var.m12548q()) {
                bundle.putString(strM12547p, x96Var.m12549r());
            } else if (x96Var.m12550s()) {
                bundle.putString(strM12547p, String.valueOf(x96Var.m12551t()));
            }
        }
        m9767K(builder, op5Var.m9221A(str, e56.f17818t0).split("\\|"), bundle, setOf);
        List<pb6> listUnmodifiableList = Collections.unmodifiableList(((ua6) qa6Var.f31181b).m11428T1());
        Bundle bundle2 = new Bundle();
        for (pb6 pb6Var : listUnmodifiableList) {
            String strM9482q = pb6Var.m9482q();
            if (pb6Var.m9489x()) {
                bundle2.putString(strM9482q, String.valueOf(pb6Var.m9490y()));
            } else if (pb6Var.m9487v()) {
                bundle2.putString(strM9482q, String.valueOf(pb6Var.m9488w()));
            } else if (pb6Var.m9483r()) {
                bundle2.putString(strM9482q, pb6Var.m9484s());
            } else if (pb6Var.m9485t()) {
                bundle2.putString(strM9482q, String.valueOf(pb6Var.m9486u()));
            }
        }
        m9767K(builder, op5Var.m9221A(str, e56.f17816s0).split("\\|"), bundle2, setOf);
        m9764H(builder, "dma", true != ((ua6) qa6Var.f31181b).m11377C0() ? "0" : "1", setOf);
        if (!((ua6) qa6Var.f31181b).m11383E0().isEmpty()) {
            m9764H(builder, "dma_cps", ((ua6) qa6Var.f31181b).m11383E0(), setOf);
        }
        if (((ua6) qa6Var.f31181b).m11401K0()) {
            c86 c86VarM11404L0 = ((ua6) qa6Var.f31181b).m11404L0();
            if (!c86VarM11404L0.m3925y().isEmpty()) {
                m9764H(builder, "dl_gclid", c86VarM11404L0.m3925y(), setOf);
            }
            if (!c86VarM11404L0.m3895A().isEmpty()) {
                m9764H(builder, "dl_gbraid", c86VarM11404L0.m3895A(), setOf);
            }
            if (!c86VarM11404L0.m3897C().isEmpty()) {
                m9764H(builder, "dl_gs", c86VarM11404L0.m3897C(), setOf);
            }
            if (c86VarM11404L0.m3899E() > 0) {
                m9764H(builder, "dl_ss_ts", String.valueOf(c86VarM11404L0.m3899E()), setOf);
            }
            if (!c86VarM11404L0.m3901G().isEmpty()) {
                m9764H(builder, "mr_gclid", c86VarM11404L0.m3901G(), setOf);
            }
            if (!c86VarM11404L0.m3903I().isEmpty()) {
                m9764H(builder, "mr_gbraid", c86VarM11404L0.m3903I(), setOf);
            }
            if (!c86VarM11404L0.m3905K().isEmpty()) {
                m9764H(builder, "mr_gs", c86VarM11404L0.m3905K(), setOf);
            }
            if (c86VarM11404L0.m3907M() > 0) {
                m9764H(builder, "mr_click_ts", String.valueOf(c86VarM11404L0.m3907M()), setOf);
            }
        }
        return new cl6(1, jCurrentTimeMillis, builder.build().toString());
    }

    /* JADX INFO: renamed from: Z */
    public m96 m9790Z(cs5 cs5Var) {
        l96 l96VarM8235y = m96.m8235y();
        long j = cs5Var.f16436e;
        l96VarM8235y.m11054c();
        ((m96) l96VarM8235y.f31181b).m8242G(j);
        os5 os5Var = cs5Var.f16437f;
        Objects.requireNonNull(os5Var);
        Bundle bundle = os5Var.f27065d;
        for (String str : bundle.keySet()) {
            u96 u96VarM12535A = x96.m12535A();
            u96VarM12535A.m11305h(str);
            Object obj = bundle.get(str);
            y42.m12854a0(obj);
            m9788X(u96VarM12535A, obj);
            l96VarM8235y.m7879k(u96VarM12535A);
        }
        String str2 = cs5Var.f16434c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            u96 u96VarM12535A2 = x96.m12535A();
            u96VarM12535A2.m11305h("_o");
            u96VarM12535A2.m11306i(str2);
            l96VarM8235y.m7878j((x96) u96VarM12535A2.m11056e());
        }
        return (m96) l96VarM8235y.m11056e();
    }

    /* JADX INFO: renamed from: a0 */
    public String m9791a0(pa6 pa6Var) {
        String str;
        String str2;
        String str3;
        o86 o86VarM11392H0;
        if (pa6Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (pa6Var.m9457t()) {
            m9769M(sb, 0, "upload_subdomain", pa6Var.m9458u());
        }
        if (pa6Var.m9455r()) {
            m9769M(sb, 0, "sgtm_join_id", pa6Var.m9456s());
        }
        for (ua6 ua6Var : pa6Var.m9452o()) {
            if (ua6Var != null) {
                m9763G(1, sb);
                sb.append("bundle {\n");
                if (ua6Var.m11412O()) {
                    m9769M(sb, 1, "protocol_version", Integer.valueOf(ua6Var.m11413O0()));
                }
                oa6 oa6Var = (oa6) this.f36084a;
                op5 op5Var = oa6Var.f26512d;
                p66 p66Var = oa6Var.f26518j;
                if (op5Var.m9225E(ua6Var.m11487o(), e56.f17742M0) && ua6Var.m11506u0()) {
                    m9769M(sb, 1, "session_stitching_token", ua6Var.m11509v0());
                }
                m9769M(sb, 1, "platform", ua6Var.m11466g2());
                if (ua6Var.m11493q()) {
                    m9769M(sb, 1, "gmp_version", Long.valueOf(ua6Var.m11496r()));
                }
                if (ua6Var.m11499s()) {
                    m9769M(sb, 1, "uploading_gmp_version", Long.valueOf(ua6Var.m11502t()));
                }
                if (ua6Var.m11494q0()) {
                    m9769M(sb, 1, "dynamite_version", Long.valueOf(ua6Var.m11497r0()));
                }
                if (ua6Var.m11400K()) {
                    m9769M(sb, 1, "config_version", Long.valueOf(ua6Var.m11403L()));
                }
                m9769M(sb, 1, "gmp_app_id", ua6Var.m11379D());
                m9769M(sb, 1, "app_id", ua6Var.m11487o());
                m9769M(sb, 1, "app_version", ua6Var.m11490p());
                if (ua6Var.m11394I()) {
                    m9769M(sb, 1, "app_version_major", Integer.valueOf(ua6Var.m11397J()));
                }
                m9769M(sb, 1, "firebase_instance_id", ua6Var.m11391H());
                if (ua6Var.m11517y()) {
                    m9769M(sb, 1, "dev_cert_hash", Long.valueOf(ua6Var.m11520z()));
                }
                m9769M(sb, 1, "app_store", ua6Var.m11484m2());
                if (ua6Var.m11436W1()) {
                    m9769M(sb, 1, "upload_timestamp_millis", Long.valueOf(ua6Var.m11439X1()));
                }
                if (ua6Var.m11442Y1()) {
                    m9769M(sb, 1, "start_timestamp_millis", Long.valueOf(ua6Var.m11445Z1()));
                }
                if (ua6Var.m11448a2()) {
                    m9769M(sb, 1, "end_timestamp_millis", Long.valueOf(ua6Var.m11451b2()));
                }
                if (ua6Var.m11454c2()) {
                    m9769M(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(ua6Var.m11457d2()));
                }
                if (ua6Var.m11460e2()) {
                    m9769M(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(ua6Var.m11463f2()));
                }
                m9769M(sb, 1, "app_instance_id", ua6Var.m11514x());
                m9769M(sb, 1, "resettable_device_id", ua6Var.m11505u());
                m9769M(sb, 1, "ds_id", ua6Var.m11409N());
                if (ua6Var.m11508v()) {
                    m9769M(sb, 1, "limited_ad_tracking", Boolean.valueOf(ua6Var.m11511w()));
                }
                m9769M(sb, 1, "os_version", ua6Var.m11469h2());
                m9769M(sb, 1, "device_model", ua6Var.m11472i2());
                m9769M(sb, 1, "user_default_language", ua6Var.m11475j2());
                if (ua6Var.m11478k2()) {
                    m9769M(sb, 1, "time_zone_offset_minutes", Integer.valueOf(ua6Var.m11481l2()));
                }
                if (ua6Var.m11370A()) {
                    m9769M(sb, 1, "bundle_sequential_index", Integer.valueOf(ua6Var.m11373B()));
                }
                if (ua6Var.m11395I0()) {
                    m9769M(sb, 1, "delivery_index", Integer.valueOf(ua6Var.m11398J0()));
                }
                if (ua6Var.m11382E()) {
                    m9769M(sb, 1, "service_upload", Boolean.valueOf(ua6Var.m11385F()));
                }
                m9769M(sb, 1, "health_monitor", ua6Var.m11376C());
                if (ua6Var.m11488o0()) {
                    m9769M(sb, 1, "retry_counter", Integer.valueOf(ua6Var.m11491p0()));
                }
                if (ua6Var.m11500s0()) {
                    m9769M(sb, 1, "consent_signals", ua6Var.m11503t0());
                }
                if (ua6Var.m11374B0()) {
                    m9769M(sb, 1, "is_dma_region", Boolean.valueOf(ua6Var.m11377C0()));
                }
                if (ua6Var.m11380D0()) {
                    m9769M(sb, 1, "core_platform_services", ua6Var.m11383E0());
                }
                if (ua6Var.m11521z0()) {
                    m9769M(sb, 1, "consent_diagnostics", ua6Var.m11371A0());
                }
                if (ua6Var.m11512w0()) {
                    m9769M(sb, 1, "target_os_version", Long.valueOf(ua6Var.m11515x0()));
                }
                ho6.m6466a();
                if (oa6Var.f26512d.m9225E(ua6Var.m11487o(), e56.f17748P0)) {
                    m9769M(sb, 1, "ad_services_version", Integer.valueOf(ua6Var.m11386F0()));
                    if (ua6Var.m11389G0() && (o86VarM11392H0 = ua6Var.m11392H0()) != null) {
                        m9763G(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        m9769M(sb, 2, "eligible", Boolean.valueOf(o86VarM11392H0.m8995o()));
                        m9769M(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(o86VarM11392H0.m8996p()));
                        m9769M(sb, 2, "pre_r", Boolean.valueOf(o86VarM11392H0.m8997q()));
                        m9769M(sb, 2, "r_extensions_too_old", Boolean.valueOf(o86VarM11392H0.m8998r()));
                        m9769M(sb, 2, "adservices_extension_too_old", Boolean.valueOf(o86VarM11392H0.m8999s()));
                        m9769M(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(o86VarM11392H0.m9000t()));
                        m9769M(sb, 2, "measurement_manager_disabled", Boolean.valueOf(o86VarM11392H0.m9001u()));
                        m9763G(2, sb);
                        sb.append("}\n");
                    }
                }
                if (ua6Var.m11401K0()) {
                    c86 c86VarM11404L0 = ua6Var.m11404L0();
                    m9763G(2, sb);
                    sb.append("ad_campaign_info {\n");
                    if (c86VarM11404L0.m3924x()) {
                        m9769M(sb, 2, "deep_link_gclid", c86VarM11404L0.m3925y());
                    }
                    if (c86VarM11404L0.m3926z()) {
                        m9769M(sb, 2, "deep_link_gbraid", c86VarM11404L0.m3895A());
                    }
                    if (c86VarM11404L0.m3896B()) {
                        m9769M(sb, 2, "deep_link_gad_source", c86VarM11404L0.m3897C());
                    }
                    if (c86VarM11404L0.m3898D()) {
                        m9769M(sb, 2, "deep_link_session_millis", Long.valueOf(c86VarM11404L0.m3899E()));
                    }
                    if (c86VarM11404L0.m3900F()) {
                        m9769M(sb, 2, "market_referrer_gclid", c86VarM11404L0.m3901G());
                    }
                    if (c86VarM11404L0.m3902H()) {
                        m9769M(sb, 2, "market_referrer_gbraid", c86VarM11404L0.m3903I());
                    }
                    if (c86VarM11404L0.m3904J()) {
                        m9769M(sb, 2, "market_referrer_gad_source", c86VarM11404L0.m3905K());
                    }
                    if (c86VarM11404L0.m3906L()) {
                        m9769M(sb, 2, "market_referrer_click_millis", Long.valueOf(c86VarM11404L0.m3907M()));
                    }
                    m9763G(2, sb);
                    sb.append("}\n");
                }
                if (ua6Var.m11415P()) {
                    m9769M(sb, 1, "batching_timestamp_millis", Long.valueOf(ua6Var.m11418Q()));
                }
                if (ua6Var.m11407M0()) {
                    nb6 nb6VarM11410N0 = ua6Var.m11410N0();
                    m9763G(2, sb);
                    sb.append("sgtm_diagnostics {\n");
                    int iM8685s = nb6VarM11410N0.m8685s();
                    if (iM8685s == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iM8685s == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iM8685s != 3) {
                        str2 = iM8685s != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    m9769M(sb, 2, "upload_type", str2);
                    m9769M(sb, 2, "client_upload_eligibility", sk5.m10851q(nb6VarM11410N0.m8683o()));
                    int iM8686t = nb6VarM11410N0.m8686t();
                    if (iM8686t == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iM8686t == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iM8686t == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iM8686t != 4) {
                        str3 = iM8686t != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    m9769M(sb, 2, "service_upload_eligibility", str3);
                    m9763G(2, sb);
                    sb.append("}\n");
                }
                if (ua6Var.m11421R()) {
                    f96 f96VarM11424S = ua6Var.m11424S();
                    m9763G(2, sb);
                    sb.append("consent_info_extra {\n");
                    for (b96 b96Var : f96VarM11424S.m5620o()) {
                        m9763G(3, sb);
                        sb.append("limited_data_modes {\n");
                        int iM3517p = b96Var.m3517p();
                        if (iM3517p == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iM3517p == 2) {
                            str = "AD_STORAGE";
                        } else if (iM3517p != 3) {
                            str = iM3517p != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        m9769M(sb, 3, "type", str);
                        int iM3518q = b96Var.m3518q();
                        m9769M(sb, 3, "mode", iM3518q != 1 ? iM3518q != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        m9763G(3, sb);
                        sb.append("}\n");
                    }
                    m9763G(2, sb);
                    sb.append("}\n");
                }
                mi6<pb6> mi6VarM11428T1 = ua6Var.m11428T1();
                if (mi6VarM11428T1 != null) {
                    for (pb6 pb6Var : mi6VarM11428T1) {
                        if (pb6Var != null) {
                            m9763G(2, sb);
                            sb.append("user_property {\n");
                            m9769M(sb, 2, "set_timestamp_millis", pb6Var.m9480o() ? Long.valueOf(pb6Var.m9481p()) : null);
                            m9769M(sb, 2, "name", p66Var.m9368c(pb6Var.m9482q()));
                            m9769M(sb, 2, "string_value", pb6Var.m9484s());
                            m9769M(sb, 2, "int_value", pb6Var.m9485t() ? Long.valueOf(pb6Var.m9486u()) : null);
                            m9769M(sb, 2, "double_value", pb6Var.m9489x() ? Double.valueOf(pb6Var.m9490y()) : null);
                            m9763G(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                mi6<r86> mi6VarM11388G = ua6Var.m11388G();
                if (mi6VarM11388G != null) {
                    for (r86 r86Var : mi6VarM11388G) {
                        if (r86Var != null) {
                            m9763G(2, sb);
                            sb.append("audience_membership {\n");
                            if (r86Var.m10237o()) {
                                m9769M(sb, 2, "audience_id", Integer.valueOf(r86Var.m10238p()));
                            }
                            if (r86Var.m10242t()) {
                                m9769M(sb, 2, "new_audience", Boolean.valueOf(r86Var.m10243u()));
                            }
                            m9768L(sb, "current_data", r86Var.m10239q());
                            if (r86Var.m10240r()) {
                                m9768L(sb, "previous_data", r86Var.m10241s());
                            }
                            m9763G(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                List<m96> listM11414O1 = ua6Var.m11414O1();
                if (listM11414O1 != null) {
                    for (m96 m96Var : listM11414O1) {
                        if (m96Var != null) {
                            m9763G(2, sb);
                            sb.append("event {\n");
                            m9769M(sb, 2, "name", p66Var.m9366a(m96Var.m8247r()));
                            if (m96Var.m8248s()) {
                                m9769M(sb, 2, "timestamp_millis", Long.valueOf(m96Var.m8249t()));
                            }
                            if (m96Var.m8250u()) {
                                m9769M(sb, 2, "previous_timestamp_millis", Long.valueOf(m96Var.m8251v()));
                            }
                            if (m96Var.m8252w()) {
                                m9769M(sb, 2, "count", Integer.valueOf(m96Var.m8253x()));
                            }
                            if (m96Var.m8245p() != 0) {
                                m9783E(sb, 2, (mi6) m96Var.m8244o());
                            }
                            m9763G(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                m9763G(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b0 */
    public String m9792b0(u46 u46Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (u46Var.m11239o()) {
            m9769M(sb, 0, "filter_id", Integer.valueOf(u46Var.m11240p()));
        }
        m9769M(sb, 0, "property_name", ((oa6) this.f36084a).f26518j.m9368c(u46Var.m11241q()));
        String strM9765I = m9765I(u46Var.m11243s(), u46Var.m11244t(), u46Var.m11246v());
        if (!strM9765I.isEmpty()) {
            m9769M(sb, 0, "filter_type", strM9765I);
        }
        m9784F(sb, 1, u46Var.m11242r());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c0 */
    public Parcelable m9793c0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (cu3 unused) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12504a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    /* JADX INFO: renamed from: g0 */
    public List m9794g0(li6 li6Var, List list) {
        int i;
        oa6 oa6Var = (oa6) this.f36084a;
        ArrayList arrayList = new ArrayList(li6Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12505b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    d76 d76Var2 = oa6Var.f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16838m.m12506c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m9795h0(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((oa6) this.f36084a).f26519k.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* JADX INFO: renamed from: i0 */
    public long m9796i0(byte[] bArr) {
        y42.m12854a0(bArr);
        oa6 oa6Var = (oa6) this.f36084a;
        dn6 dn6Var = oa6Var.f26517i;
        oa6.m9014j(dn6Var);
        dn6Var.mo5038t();
        MessageDigest messageDigestM4565L = dn6.m4565L();
        if (messageDigestM4565L != null) {
            return dn6.m4566M(messageDigestM4565L.digest(bArr));
        }
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16835j.m12504a("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: renamed from: j0 */
    public byte[] m9797j0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16835j.m12505b(e, "Failed to gzip content");
            throw e;
        }
    }

    @Override // p000.rl6
    /* JADX INFO: renamed from: x */
    public final void mo3209x() {
        byte b = this.f28266h;
    }

    /* JADX INFO: renamed from: P */
    private final void m9771P() {
    }

    /* JADX INFO: renamed from: R */
    private final void m9772R() {
    }

    /* JADX INFO: renamed from: U */
    private final void m9773U() {
    }
}
