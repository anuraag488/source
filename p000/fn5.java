package p000;

import android.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fn5 {

    /* JADX INFO: renamed from: a */
    public final String f19145a;

    /* JADX INFO: renamed from: b */
    public final int f19146b;

    /* JADX INFO: renamed from: c */
    public Boolean f19147c;

    /* JADX INFO: renamed from: d */
    public Boolean f19148d;

    /* JADX INFO: renamed from: e */
    public Long f19149e;

    /* JADX INFO: renamed from: f */
    public Long f19150f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ byte f19151g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ vn5 f19152h;

    /* JADX INFO: renamed from: i */
    public final zh6 f19153i;

    public fn5(vn5 vn5Var, String str, int i, zh6 zh6Var, byte b) {
        this.f19151g = b;
        this.f19152h = vn5Var;
        this.f19145a = str;
        this.f19146b = i;
        this.f19153i = zh6Var;
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m5756c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: d */
    public static Boolean m5757d(String str, w46 w46Var, d76 d76Var) {
        List listM12102t;
        y42.m12854a0(w46Var);
        if (str != null && w46Var.m12097o() && w46Var.m12104w() != 1 && (w46Var.m12104w() != 7 ? w46Var.m12098p() : w46Var.m12103u() != 0)) {
            int iM12104w = w46Var.m12104w();
            boolean zM12101s = w46Var.m12101s();
            String strM12099q = (zM12101s || iM12104w == 2 || iM12104w == 7) ? w46Var.m12099q() : w46Var.m12099q().toUpperCase(Locale.ENGLISH);
            if (w46Var.m12103u() == 0) {
                listM12102t = null;
            } else {
                listM12102t = w46Var.m12102t();
                if (!zM12101s) {
                    ArrayList arrayList = new ArrayList(listM12102t.size());
                    Iterator it = listM12102t.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listM12102t = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iM12104w == 2 ? strM12099q : null;
            if (iM12104w != 7 ? strM12099q != null : listM12102t != null && !listM12102t.isEmpty()) {
                if (!zM12101s && iM12104w != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iM12104w - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zM12101s ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (d76Var != null) {
                                    d76Var.f16838m.m12505b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strM12099q));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strM12099q));
                    case 4:
                        return Boolean.valueOf(str.contains(strM12099q));
                    case 5:
                        return Boolean.valueOf(str.equals(strM12099q));
                    case 6:
                        if (listM12102t != null) {
                            return Boolean.valueOf(listM12102t.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0111  */
    /* JADX INFO: renamed from: e */
    public static Boolean m5758e(BigDecimal bigDecimal, o46 o46Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        y42.m12854a0(o46Var);
        if (o46Var.m8944o()) {
            if (o46Var.m8953y() != 1 && (o46Var.m8953y() != 5 ? o46Var.m8947r() : o46Var.m8949t() && o46Var.m8951v())) {
                int iM8953y = o46Var.m8953y();
                try {
                    if (o46Var.m8953y() == 5) {
                        if (q76.m9774d0(o46Var.m8950u()) && q76.m9774d0(o46Var.m8952w())) {
                            BigDecimal bigDecimal5 = new BigDecimal(o46Var.m8950u());
                            bigDecimal4 = new BigDecimal(o46Var.m8952w());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iM8953y == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iM8953y - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (q76.m9774d0(o46Var.m8948s())) {
                        bigDecimal2 = new BigDecimal(o46Var.m8948s());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iM8953y == 5) {
                            i = iM8953y - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iM8953y - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public boolean m5759a(Long l, Long l2, m96 m96Var, long j, fs5 fs5Var, boolean z) {
        HashSet hashSet;
        Iterator it;
        C0805jo c0805jo;
        Iterator it2;
        Iterator it3;
        j46 j46Var;
        boolean z2;
        String strM7011v;
        Object obj;
        Boolean boolM5758e;
        Boolean boolM5758e2;
        String str;
        o46 o46VarM7007r;
        long j2;
        Boolean boolM5758e3;
        x96 x96Var;
        Long lValueOf;
        Double dValueOf;
        j46 j46Var2;
        Boolean boolM5758e4;
        int i;
        fn6.m5761a();
        vn5 vn5Var = this.f19152h;
        oa6 oa6Var = (oa6) vn5Var.f36084a;
        op5 op5Var = oa6Var.f26512d;
        d76 d76Var = oa6Var.f26514f;
        p66 p66Var = oa6Var.f26518j;
        d56 d56Var = e56.f17728F0;
        String str2 = this.f19145a;
        boolean zM9225E = op5Var.m9225E(str2, d56Var);
        f46 f46Var = (f46) this.f19153i;
        long j3 = f46Var.m5521z() ? fs5Var.f19258e : j;
        oa6.m9016l(d76Var);
        x66 x66Var = d76Var.f16831L;
        x66 x66Var2 = d76Var.f16838m;
        boolean zIsLoggable = Log.isLoggable(d76Var.m4402A(), 2);
        int i2 = this.f19146b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            oa6.m9016l(d76Var);
            x66Var.m12507d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), f46Var.m5510o() ? Integer.valueOf(f46Var.m5511p()) : null, p66Var.m9366a(f46Var.m5512q()));
            oa6.m9016l(d76Var);
            q76 q76Var = vn5Var.f19870f.f28597g;
            qm6.m9925S(q76Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (f46Var.m5510o()) {
                i = 0;
                q76.m9769M(sb, 0, "filter_id", Integer.valueOf(f46Var.m5511p()));
            } else {
                i = 0;
            }
            q76.m9769M(sb, i, "event_name", ((oa6) q76Var.f36084a).f26518j.m9366a(f46Var.m5512q()));
            String strM9765I = q76.m9765I(f46Var.m5518w(), f46Var.m5519x(), f46Var.m5521z());
            if (!strM9765I.isEmpty()) {
                q76.m9769M(sb, 0, "filter_type", strM9765I);
            }
            if (f46Var.m5516u()) {
                q76.m9770N(sb, 1, "event_count_filter", f46Var.m5517v());
            }
            if (f46Var.m5514s() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = f46Var.m5513r().iterator();
                while (it4.hasNext()) {
                    q76Var.m9784F(sb, 2, (j46) it4.next());
                }
            }
            q76.m9763G(1, sb);
            sb.append("}\n}\n");
            x66Var.m12505b(sb.toString(), "Filter definition");
        }
        if (!f46Var.m5510o() || f46Var.m5511p() > 256) {
            oa6.m9016l(d76Var);
            x66Var2.m12506c("Invalid event filter ID. appId, id", d76.m4401y(str2), String.valueOf(f46Var.m5510o() ? Integer.valueOf(f46Var.m5511p()) : null));
            return false;
        }
        boolean z3 = f46Var.m5518w() || f46Var.m5519x() || f46Var.m5521z();
        if (z && !z3) {
            oa6.m9016l(d76Var);
            x66Var.m12506c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i2), f46Var.m5510o() ? Integer.valueOf(f46Var.m5511p()) : null);
            return true;
        }
        String strM8247r = m96Var.m8247r();
        if (!f46Var.m5516u()) {
            hashSet = new HashSet();
            it = f46Var.m5513r().iterator();
            while (true) {
                if (it.hasNext()) {
                    c0805jo = new C0805jo(0);
                    it2 = m96Var.m8244o().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = f46Var.m5513r().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zM9225E = zM9225E;
                                    d76Var = d76Var;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                j46Var = (j46) it3.next();
                                if (j46Var.m7008s()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strM7011v = j46Var.m7011v();
                                if (strM7011v.isEmpty()) {
                                    obj = c0805jo.get(strM7011v);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zM9225E = zM9225E;
                                                d76Var = d76Var;
                                                if (obj == null) {
                                                    oa6.m9016l(d76Var);
                                                    x66Var2.m12506c("Unknown param type. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                                    break;
                                                }
                                                oa6.m9016l(d76Var);
                                                x66Var.m12506c("Missing param for filter. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (j46Var.m7004o()) {
                                                if (j46Var.m7006q()) {
                                                    zM9225E = zM9225E;
                                                    d76Var = d76Var;
                                                    oa6.m9016l(d76Var);
                                                    x66Var2.m12506c("No filter for String param. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (q76.m9774d0(str)) {
                                                    zM9225E = zM9225E;
                                                    d76Var = d76Var;
                                                    oa6.m9016l(d76Var);
                                                    x66Var2.m12506c("Invalid param value for number filter. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                                    break;
                                                }
                                                o46VarM7007r = j46Var.m7007r();
                                                if (q76.m9774d0(str)) {
                                                    zM9225E = zM9225E;
                                                    d76Var = d76Var;
                                                    j2 = 0;
                                                    boolM5758e3 = m5758e(new BigDecimal(str), o46VarM7007r, 0.0d);
                                                } else {
                                                    boolM5758e3 = null;
                                                }
                                                if (boolM5758e3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolM5758e3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                d76Var = d76Var;
                                                zM9225E = zM9225E;
                                            } else {
                                                w46 w46VarM7005p = j46Var.m7005p();
                                                oa6.m9016l(d76Var);
                                                boolM5758e3 = m5757d((String) obj, w46VarM7005p, d76Var);
                                            }
                                            j2 = 0;
                                            if (boolM5758e3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolM5758e3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            d76Var = d76Var;
                                            zM9225E = zM9225E;
                                        } else if (j46Var.m7006q()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolM5758e2 = m5758e(new BigDecimal(dDoubleValue), j46Var.m7007r(), Math.ulp(dDoubleValue));
                                            if (boolM5758e2 != null) {
                                                if (boolM5758e2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            oa6.m9016l(d76Var);
                                            x66Var2.m12506c("No number filter for double param. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                        }
                                    } else if (j46Var.m7006q()) {
                                        boolM5758e = m5758e(new BigDecimal(((Long) obj).longValue()), j46Var.m7007r(), 0.0d);
                                        if (boolM5758e != null) {
                                            if (boolM5758e.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        oa6.m9016l(d76Var);
                                        x66Var2.m12506c("No number filter for long param. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                    }
                                } else {
                                    oa6.m9016l(d76Var);
                                    x66Var2.m12505b(p66Var.m9366a(strM8247r), "Event has empty param name. event");
                                }
                            }
                        } else {
                            x96Var = (x96) it2.next();
                            if (!hashSet.contains(x96Var.m12547p())) {
                                if (x96Var.m12550s()) {
                                    String strM12547p = x96Var.m12547p();
                                    if (x96Var.m12550s()) {
                                        lValueOf = Long.valueOf(x96Var.m12551t());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c0805jo.put(strM12547p, lValueOf);
                                } else if (x96Var.m12554w()) {
                                    String strM12547p2 = x96Var.m12547p();
                                    if (x96Var.m12554w()) {
                                        dValueOf = Double.valueOf(x96Var.m12555x());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c0805jo.put(strM12547p2, dValueOf);
                                } else if (x96Var.m12548q()) {
                                    c0805jo.put(x96Var.m12547p(), x96Var.m12549r());
                                } else {
                                    oa6.m9016l(d76Var);
                                    x66Var2.m12506c("Unknown value for param. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(x96Var.m12547p()));
                                }
                            }
                        }
                    }
                } else {
                    j46Var2 = (j46) it.next();
                    if (j46Var2.m7011v().isEmpty()) {
                        oa6.m9016l(d76Var);
                        x66Var2.m12505b(p66Var.m9366a(strM8247r), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(j46Var2.m7011v());
                    }
                }
                zM9225E = zM9225E;
                d76Var = d76Var;
                break;
            }
        }
        try {
            boolM5758e4 = m5758e(new BigDecimal(j3), f46Var.m5517v(), 0.0d);
        } catch (NumberFormatException unused) {
            boolM5758e4 = null;
        }
        if (boolM5758e4 != null) {
            if (boolM5758e4.booleanValue()) {
                hashSet = new HashSet();
                it = f46Var.m5513r().iterator();
                while (true) {
                    if (it.hasNext()) {
                        c0805jo = new C0805jo(0);
                        it2 = m96Var.m8244o().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = f46Var.m5513r().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zM9225E = zM9225E;
                                        d76Var = d76Var;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    j46Var = (j46) it3.next();
                                    if (j46Var.m7008s() || !j46Var.m7009t()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strM7011v = j46Var.m7011v();
                                    if (strM7011v.isEmpty()) {
                                        obj = c0805jo.get(strM7011v);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zM9225E = zM9225E;
                                                    d76Var = d76Var;
                                                    if (obj == null) {
                                                        oa6.m9016l(d76Var);
                                                        x66Var2.m12506c("Unknown param type. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                                        break;
                                                    }
                                                    oa6.m9016l(d76Var);
                                                    x66Var.m12506c("Missing param for filter. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (j46Var.m7004o()) {
                                                    if (j46Var.m7006q()) {
                                                        zM9225E = zM9225E;
                                                        d76Var = d76Var;
                                                        oa6.m9016l(d76Var);
                                                        x66Var2.m12506c("No filter for String param. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (q76.m9774d0(str)) {
                                                        zM9225E = zM9225E;
                                                        d76Var = d76Var;
                                                        oa6.m9016l(d76Var);
                                                        x66Var2.m12506c("Invalid param value for number filter. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                                        break;
                                                    }
                                                    o46VarM7007r = j46Var.m7007r();
                                                    if (q76.m9774d0(str)) {
                                                        boolM5758e3 = null;
                                                    } else {
                                                        try {
                                                            zM9225E = zM9225E;
                                                            d76Var = d76Var;
                                                            j2 = 0;
                                                            try {
                                                                boolM5758e3 = m5758e(new BigDecimal(str), o46VarM7007r, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolM5758e3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zM9225E = zM9225E;
                                                            d76Var = d76Var;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolM5758e3 != null) {
                                                        break;
                                                    }
                                                    if (boolM5758e3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    d76Var = d76Var;
                                                    zM9225E = zM9225E;
                                                } else {
                                                    w46 w46VarM7005p2 = j46Var.m7005p();
                                                    oa6.m9016l(d76Var);
                                                    boolM5758e3 = m5757d((String) obj, w46VarM7005p2, d76Var);
                                                }
                                                j2 = 0;
                                                if (boolM5758e3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolM5758e3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                d76Var = d76Var;
                                                zM9225E = zM9225E;
                                            } else if (j46Var.m7006q()) {
                                                oa6.m9016l(d76Var);
                                                x66Var2.m12506c("No number filter for double param. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolM5758e2 = m5758e(new BigDecimal(dDoubleValue2), j46Var.m7007r(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolM5758e2 = null;
                                                }
                                                if (boolM5758e2 != null) {
                                                    if (boolM5758e2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (j46Var.m7006q()) {
                                            oa6.m9016l(d76Var);
                                            x66Var2.m12506c("No number filter for long param. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(strM7011v));
                                        } else {
                                            try {
                                                boolM5758e = m5758e(new BigDecimal(((Long) obj).longValue()), j46Var.m7007r(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolM5758e = null;
                                            }
                                            if (boolM5758e != null) {
                                                if (boolM5758e.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        oa6.m9016l(d76Var);
                                        x66Var2.m12505b(p66Var.m9366a(strM8247r), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                x96Var = (x96) it2.next();
                                if (!hashSet.contains(x96Var.m12547p())) {
                                    if (x96Var.m12550s()) {
                                        String strM12547p3 = x96Var.m12547p();
                                        if (x96Var.m12550s()) {
                                            lValueOf = Long.valueOf(x96Var.m12551t());
                                        } else {
                                            lValueOf = null;
                                        }
                                        c0805jo.put(strM12547p3, lValueOf);
                                    } else if (x96Var.m12554w()) {
                                        String strM12547p4 = x96Var.m12547p();
                                        if (x96Var.m12554w()) {
                                            dValueOf = Double.valueOf(x96Var.m12555x());
                                        } else {
                                            dValueOf = null;
                                        }
                                        c0805jo.put(strM12547p4, dValueOf);
                                    } else if (x96Var.m12548q()) {
                                        c0805jo.put(x96Var.m12547p(), x96Var.m12549r());
                                    } else {
                                        oa6.m9016l(d76Var);
                                        x66Var2.m12506c("Unknown value for param. event, param", p66Var.m9366a(strM8247r), p66Var.m9367b(x96Var.m12547p()));
                                    }
                                }
                            }
                        }
                    } else {
                        j46Var2 = (j46) it.next();
                        if (j46Var2.m7011v().isEmpty()) {
                            oa6.m9016l(d76Var);
                            x66Var2.m12505b(p66Var.m9366a(strM8247r), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(j46Var2.m7011v());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zM9225E = zM9225E;
        d76Var = d76Var;
        break;
        oa6.m9016l(d76Var);
        x66Var.m12505b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f19147c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f19148d = bool2;
        if (!z3 || !m96Var.m8248s()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(m96Var.m8249t());
        if (f46Var.m5519x()) {
            if (zM9225E && f46Var.m5516u()) {
                lValueOf2 = l;
            }
            this.f19150f = lValueOf2;
            return true;
        }
        if (zM9225E && f46Var.m5516u()) {
            lValueOf2 = l2;
        }
        this.f19149e = lValueOf2;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m5760b(Long l, Long l2, pb6 pb6Var, boolean z) {
        boolean z2;
        Boolean boolM5756c;
        Boolean boolM5758e;
        Boolean boolM5758e2;
        Boolean boolM5758e3;
        fn6.m5761a();
        oa6 oa6Var = (oa6) this.f19152h.f36084a;
        op5 op5Var = oa6Var.f26512d;
        p66 p66Var = oa6Var.f26518j;
        d76 d76Var = oa6Var.f26514f;
        boolean zM9225E = op5Var.m9225E(this.f19145a, e56.f17724D0);
        u46 u46Var = (u46) this.f19153i;
        boolean zM11243s = u46Var.m11243s();
        boolean zM11244t = u46Var.m11244t();
        boolean zM11246v = u46Var.m11246v();
        boolean z3 = zM11243s || zM11244t || zM11246v;
        if (z && !z3) {
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12506c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f19146b), u46Var.m11239o() ? Integer.valueOf(u46Var.m11240p()) : null);
            return true;
        }
        j46 j46VarM11242r = u46Var.m11242r();
        boolean zM7009t = j46VarM11242r.m7009t();
        if (!pb6Var.m9485t()) {
            z2 = zM11246v;
            if (!pb6Var.m9489x()) {
                if (!pb6Var.m9483r()) {
                    oa6.m9016l(d76Var);
                    d76Var.f16838m.m12505b(p66Var.m9368c(pb6Var.m9482q()), "User property has no value, property");
                } else if (j46VarM11242r.m7004o()) {
                    String strM9484s = pb6Var.m9484s();
                    w46 w46VarM7005p = j46VarM11242r.m7005p();
                    oa6.m9016l(d76Var);
                    boolM5756c = m5756c(m5757d(strM9484s, w46VarM7005p, d76Var), zM7009t);
                } else if (!j46VarM11242r.m7006q()) {
                    oa6.m9016l(d76Var);
                    d76Var.f16838m.m12505b(p66Var.m9368c(pb6Var.m9482q()), "No string or number filter defined. property");
                } else if (q76.m9774d0(pb6Var.m9484s())) {
                    String strM9484s2 = pb6Var.m9484s();
                    o46 o46VarM7007r = j46VarM11242r.m7007r();
                    if (q76.m9774d0(strM9484s2)) {
                        try {
                            boolM5758e = m5758e(new BigDecimal(strM9484s2), o46VarM7007r, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolM5758e = null;
                        }
                    } else {
                        boolM5758e = null;
                    }
                    boolM5756c = m5756c(boolM5758e, zM7009t);
                } else {
                    oa6.m9016l(d76Var);
                    d76Var.f16838m.m12506c("Invalid user property value for Numeric number filter. property, value", p66Var.m9368c(pb6Var.m9482q()), pb6Var.m9484s());
                }
                boolM5756c = null;
            } else if (j46VarM11242r.m7006q()) {
                double dM9490y = pb6Var.m9490y();
                try {
                    boolM5758e2 = m5758e(new BigDecimal(dM9490y), j46VarM11242r.m7007r(), Math.ulp(dM9490y));
                } catch (NumberFormatException unused2) {
                    boolM5758e2 = null;
                }
                boolM5756c = m5756c(boolM5758e2, zM7009t);
            } else {
                oa6.m9016l(d76Var);
                d76Var.f16838m.m12505b(p66Var.m9368c(pb6Var.m9482q()), "No number filter for double property. property");
                boolM5756c = null;
            }
        } else if (j46VarM11242r.m7006q()) {
            z2 = zM11246v;
            try {
                boolM5758e3 = m5758e(new BigDecimal(pb6Var.m9486u()), j46VarM11242r.m7007r(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolM5758e3 = null;
            }
            boolM5756c = m5756c(boolM5758e3, zM7009t);
        } else {
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(p66Var.m9368c(pb6Var.m9482q()), "No number filter for long property. property");
            z2 = zM11246v;
            boolM5756c = null;
        }
        oa6.m9016l(d76Var);
        d76Var.f16831L.m12505b(boolM5756c == null ? "null" : boolM5756c, "Property filter result");
        if (boolM5756c == null) {
            return false;
        }
        this.f19147c = Boolean.TRUE;
        if (!z2 || boolM5756c.booleanValue()) {
            if (!z || u46Var.m11243s()) {
                this.f19148d = boolM5756c;
            }
            if (boolM5756c.booleanValue() && z3 && pb6Var.m9480o()) {
                long jM9481p = pb6Var.m9481p();
                if (l != null) {
                    jM9481p = l.longValue();
                }
                if (zM9225E && u46Var.m11243s() && !u46Var.m11244t() && l2 != null) {
                    jM9481p = l2.longValue();
                }
                if (u46Var.m11244t()) {
                    this.f19150f = Long.valueOf(jM9481p);
                } else {
                    this.f19149e = Long.valueOf(jM9481p);
                }
            }
        }
        return true;
    }
}
