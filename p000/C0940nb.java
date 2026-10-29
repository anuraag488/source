package p000;

import ads_mobile_sdk.g03;
import ads_mobile_sdk.n13;
import ads_mobile_sdk.rf1;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: nb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0940nb implements zj5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25604a;

    /* JADX INFO: renamed from: b */
    public Object f25605b;

    /* JADX INFO: renamed from: c */
    public Object f25606c;

    /* JADX INFO: renamed from: d */
    public Object f25607d;

    /* JADX INFO: renamed from: e */
    public Object f25608e;

    /* JADX INFO: renamed from: f */
    public Object f25609f;

    /* JADX INFO: renamed from: g */
    public Object f25610g;

    /* JADX INFO: renamed from: h */
    public Object f25611h;

    /* JADX INFO: renamed from: i */
    public Object f25612i;

    /* JADX INFO: renamed from: j */
    public Object f25613j;

    /* JADX INFO: renamed from: k */
    public Object f25614k;

    public /* synthetic */ C0940nb(byte b) {
        this.f25604a = b;
    }

    /* JADX INFO: renamed from: d */
    public static Object m8663d(C0940nb c0940nb, nq1 nq1Var, ym0 ym0Var) {
        xw2 xw2Var = xw2.f34665a;
        dx2 dx2Var = (dx2) c0940nb.f25606c;
        C0792jb c0792jb = new C0792jb(c0940nb, nq1Var, null, (byte) 0);
        dx2Var.getClass();
        Object objM13685q = zp0.m13685q(new C0667fx(xw2Var, dx2Var, c0792jb, (wm0) null), ym0Var);
        return objM13685q == ap0.f14763a ? objM13685q : ju4.f22634a;
    }

    /* JADX INFO: renamed from: f */
    public static mt2 m8664f(lt2 lt2Var, mt2 mt2Var) {
        mt2 mt2VarMo118c;
        if (lt2Var instanceof st2) {
            mt2VarMo118c = ((st2) lt2Var).mo118c();
            mt2VarMo118c.f25197c = f13.m5456f(mt2VarMo118c);
        } else {
            C1271vw c1271vw = new C1271vw();
            c1271vw.f25197c = f13.m5454d(lt2Var);
            c1271vw.f32893o = lt2Var;
            c1271vw.f32895q = new HashSet();
            mt2VarMo118c = c1271vw;
        }
        if (mt2VarMo118c.f25208n) {
            q32.m9721c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        mt2VarMo118c.f25203i = true;
        mt2 mt2Var2 = mt2Var.f25200f;
        if (mt2Var2 != null) {
            mt2Var2.f25199e = mt2VarMo118c;
            mt2VarMo118c.f25200f = mt2Var2;
        }
        mt2Var.f25200f = mt2VarMo118c;
        mt2VarMo118c.f25199e = mt2Var;
        return mt2VarMo118c;
    }

    /* JADX INFO: renamed from: g */
    public static mt2 m8665g(mt2 mt2Var) {
        boolean z = mt2Var.f25208n;
        if (z) {
            yv2 yv2Var = f13.f18660a;
            if (!z) {
                q32.m9721c("autoInvalidateRemovedNode called on unattached node");
            }
            f13.m5451a(mt2Var, -1, 2);
            mt2Var.mo8396L0();
            mt2Var.mo8393F0();
        }
        mt2 mt2Var2 = mt2Var.f25200f;
        mt2 mt2Var3 = mt2Var.f25199e;
        if (mt2Var2 != null) {
            mt2Var2.f25199e = mt2Var3;
            mt2Var.f25200f = null;
        }
        if (mt2Var3 != null) {
            mt2Var3.f25200f = mt2Var2;
            mt2Var.f25199e = null;
        }
        return mt2Var3;
    }

    /* JADX INFO: renamed from: q */
    public static void m8666q(lt2 lt2Var, lt2 lt2Var2, mt2 mt2Var) {
        if ((lt2Var instanceof st2) && (lt2Var2 instanceof st2)) {
            ((st2) lt2Var2).mo119f(mt2Var);
            if (mt2Var.f25208n) {
                f13.m5453c(mt2Var);
                return;
            } else {
                mt2Var.f25204j = true;
                return;
            }
        }
        if (!(mt2Var instanceof C1271vw)) {
            q32.m9721c("Unknown Modifier.Node type");
            return;
        }
        C1271vw c1271vw = (C1271vw) mt2Var;
        if (c1271vw.f25208n) {
            c1271vw.m11999P0();
        }
        c1271vw.f32893o = lt2Var2;
        c1271vw.f25197c = f13.m5454d(lt2Var2);
        if (c1271vw.f25208n) {
            c1271vw.m11998O0(false);
        }
        if (mt2Var.f25208n) {
            f13.m5453c(mt2Var);
        } else {
            mt2Var.f25204j = true;
        }
    }

    @Override // p000.zj5
    /* JADX INFO: renamed from: a */
    public g03 mo508a() {
        return (n13) ((ki5) this.f25614k).get();
    }

    /* JADX INFO: renamed from: b */
    public void m8667b(String str, String str2) {
        HashMap map = (HashMap) this.f25610g;
        if (map != null) {
            map.put(str, str2);
        } else {
            C1077qn.m9989o("Property \"autoMetadata\" has not been set");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: c */
    public Object m8668c(Object obj, xw2 xw2Var, oq1 oq1Var, ym0 ym0Var) {
        C0829kb c0829kb;
        d83 d83Var = (d83) this.f25609f;
        if (ym0Var instanceof C0829kb) {
            c0829kb = (C0829kb) ym0Var;
            int i = c0829kb.f23035v;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0829kb.f23035v = i - Integer.MIN_VALUE;
            } else {
                c0829kb = new C0829kb(this, ym0Var);
            }
        } else {
            c0829kb = new C0829kb(this, ym0Var);
        }
        Object obj2 = c0829kb.f23033t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c0829kb.f23035v;
        wm0 wm0Var = null;
        try {
            if (i2 == 0) {
                k43.m7376J(obj2);
                if (m8670h().m11653c(obj)) {
                    dx2 dx2Var = (dx2) this.f25606c;
                    C0866lb c0866lb = new C0866lb(this, obj, oq1Var, wm0Var, (byte) 0);
                    c0829kb.f23035v = 1;
                    dx2Var.getClass();
                    if (zp0.m13685q(new C0667fx(xw2Var, dx2Var, c0866lb, (wm0) null), c0829kb) == ap0Var) {
                        return ap0Var;
                    }
                } else if (((Boolean) ((yp1) this.f25605b).invoke(obj)).booleanValue()) {
                    ((d83) this.f25608e).setValue(obj);
                    ((d83) this.f25607d).setValue(obj);
                }
                return ju4.f22634a;
            }
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj2);
            d83Var.setValue(null);
            return ju4.f22634a;
        } catch (Throwable th) {
            d83Var.setValue(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public C0467au m8669e() {
        String strConcat = ((String) this.f25605b) == null ? " transportName" : "";
        if (((f81) this.f25607d) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.f25608e) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.f25609f) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f25610g) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (!strConcat.isEmpty()) {
            C1077qn.m9989o("Missing required properties:".concat(strConcat));
            return null;
        }
        String str = (String) this.f25605b;
        Integer num = (Integer) this.f25606c;
        f81 f81Var = (f81) this.f25607d;
        long jLongValue = ((Long) this.f25608e).longValue();
        long jLongValue2 = ((Long) this.f25609f).longValue();
        HashMap map = (HashMap) this.f25610g;
        Integer num2 = (Integer) this.f25611h;
        String str2 = (String) this.f25612i;
        byte[] bArr = (byte[]) this.f25613j;
        byte[] bArr2 = (byte[]) this.f25614k;
        C0467au c0467au = new C0467au();
        c0467au.f14865a = str;
        c0467au.f14866b = num;
        c0467au.f14867c = f81Var;
        c0467au.f14868d = jLongValue;
        c0467au.f14869e = jLongValue2;
        c0467au.f14870f = map;
        c0467au.f14871g = num2;
        c0467au.f14872h = str2;
        c0467au.f14873i = bArr;
        c0467au.f14874j = bArr2;
        VarHandle.storeStoreFence();
        return c0467au;
    }

    /* JADX INFO: renamed from: h */
    public uv0 m8670h() {
        return (uv0) ((d83) this.f25610g).getValue();
    }

    /* JADX INFO: renamed from: i */
    public boolean m8671i(int i) {
        return (((mt2) this.f25610g).f25198d & i) != 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m8672j() {
        return ((d83) this.f25609f).getValue() != null;
    }

    /* JADX INFO: renamed from: k */
    public float m8673k(float f) {
        z73 z73Var = (z73) this.f25612i;
        return sc6.m10674o((Float.isNaN(z73Var.m13399h()) ? 0.0f : z73Var.m13399h()) + f, m8670h().m11655e(), m8670h().m11654d());
    }

    /* JADX INFO: renamed from: l */
    public void m8674l(mt2 mt2Var, e13 e13Var) {
        for (mt2 mt2Var2 = mt2Var.f25199e; mt2Var2 != null; mt2Var2 = mt2Var2.f25199e) {
            if (mt2Var2 == ((a13) this.f25606c)) {
                wf2 wf2VarM12295v = ((wf2) this.f25605b).m12295v();
                e13Var.f17629y = wf2VarM12295v != null ? (w32) wf2VarM12295v.f33299G.f25607d : null;
                this.f25608e = e13Var;
                return;
            } else {
                if ((mt2Var2.f25197c & 2) != 0) {
                    return;
                }
                mt2Var2.mo8398N0(e13Var);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public float m8675m() {
        z73 z73Var = (z73) this.f25612i;
        if (Float.isNaN(z73Var.m13399h())) {
            t32.m10970c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return z73Var.m13399h();
    }

    /* JADX INFO: renamed from: n */
    public void m8676n() {
        for (mt2 mt2Var = (mt2) this.f25610g; mt2Var != null; mt2Var = mt2Var.f25200f) {
            mt2Var.mo8395K0();
            if (mt2Var.f25203i) {
                yv2 yv2Var = f13.f18660a;
                if (!mt2Var.f25208n) {
                    q32.m9721c("autoInvalidateInsertedNode called on unattached node");
                }
                f13.m5451a(mt2Var, -1, 1);
            }
            if (mt2Var.f25204j) {
                f13.m5453c(mt2Var);
            }
            mt2Var.f25203i = false;
            mt2Var.f25204j = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x014a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    /* JADX WARN: Code duplicated, block: B:40:0x0113 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x0126  */
    /* JADX WARN: Code duplicated, block: B:48:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x0192  */
    /* JADX WARN: Code duplicated, block: B:73:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a8
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: o */
    public void m8677o(int r32, p000.cw2 r33, p000.cw2 r34, p000.mt2 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0940nb.m8677o(int, cw2, cw2, mt2, boolean):void");
    }

    /* JADX INFO: renamed from: p */
    public void m8678p() {
        of2 of2Var;
        q63 q63Var;
        wf2 wf2Var = (wf2) this.f25605b;
        e13 e13Var = (w32) this.f25607d;
        for (mt2 mt2Var = ((vh4) this.f25609f).f25199e; mt2Var != null; mt2Var = mt2Var.f25199e) {
            lf2 lf2VarM10668i = sc6.m10668i(mt2Var);
            if (lf2VarM10668i != null) {
                e13 e13Var2 = mt2Var.f25202h;
                if (e13Var2 != null) {
                    of2Var = (of2) e13Var2;
                    lf2 lf2Var = of2Var.f26671e0;
                    of2Var.m9057D1(lf2VarM10668i);
                    if (lf2Var != mt2Var && (q63Var = of2Var.f17623V) != null) {
                        ((du1) q63Var).m4735c();
                    }
                } else {
                    of2Var = new of2(wf2Var, lf2VarM10668i);
                    mt2Var.mo8398N0(of2Var);
                }
                e13Var.f17629y = of2Var;
                of2Var.f17628x = e13Var;
                e13Var = of2Var;
            } else {
                mt2Var.mo8398N0(e13Var);
            }
        }
        wf2 wf2VarM12295v = wf2Var.m12295v();
        e13Var.f17629y = wf2VarM12295v != null ? (w32) wf2VarM12295v.f33299G.f25607d : null;
        this.f25608e = e13Var;
    }

    public String toString() {
        switch (this.f25604a) {
            case 2:
                StringBuilder sb = new StringBuilder("[");
                mt2 mt2Var = (mt2) this.f25610g;
                vh4 vh4Var = (vh4) this.f25609f;
                if (mt2Var == vh4Var) {
                    sb.append("]");
                } else {
                    while (mt2Var != null && mt2Var != vh4Var) {
                        sb.append(String.valueOf(mt2Var));
                        if (mt2Var.f25200f == vh4Var) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            mt2Var = mt2Var.f25200f;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p000.zj5
    /* JADX INFO: renamed from: b */
    public rf1 mo509b() {
        return (rf1) ((ki5) this.f25612i).get();
    }
}
