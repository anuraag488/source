package p000;

import androidx.work.impl.WorkDatabase_Impl;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mq4 {

    /* JADX INFO: renamed from: k */
    public static final String[] f25139k = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a */
    public boolean f25140a;

    /* JADX INFO: renamed from: b */
    public Object f25141b;

    /* JADX INFO: renamed from: c */
    public Object f25142c;

    /* JADX INFO: renamed from: d */
    public Object f25143d;

    /* JADX INFO: renamed from: e */
    public yp1 f25144e;

    /* JADX INFO: renamed from: f */
    public Object f25145f;

    /* JADX INFO: renamed from: g */
    public Object f25146g;

    /* JADX INFO: renamed from: h */
    public Object f25147h;

    /* JADX INFO: renamed from: i */
    public Object f25148i;

    /* JADX INFO: renamed from: j */
    public iq1 f25149j;

    /* JADX INFO: renamed from: a */
    public o41 m8369a() {
        yp1 yp1Var = (yp1) this.f25145f;
        if (yp1Var == null && ((yp1) this.f25146g) != null) {
            C1077qn.m9988n(zi4.m13621u("Color ", (String) this.f25141b, " has secondBackground defined, but background is not defined."));
            return null;
        }
        if (yp1Var == null && ((yp1) this.f25147h) != null) {
            C1077qn.m9988n(zi4.m13621u("Color ", (String) this.f25141b, " has contrastCurve defined, but background is not defined."));
            return null;
        }
        if (yp1Var != null && ((yp1) this.f25147h) == null) {
            C1077qn.m9988n(zi4.m13621u("Color ", (String) this.f25141b, " has background defined, but contrastCurve is not defined."));
            return null;
        }
        yp1 yp1Var2 = (yp1) this.f25143d;
        yp1 dh0Var = yp1Var2;
        if (yp1Var2 == null) {
            if (yp1Var == null) {
                dh0Var = new dh0((byte) 12);
            } else {
                C0797jg c0797jg = new C0797jg((byte) 5);
                c0797jg.f22228b = yp1Var;
                VarHandle.storeStoreFence();
                dh0Var = c0797jg;
            }
        }
        String str = (String) this.f25141b;
        yp1 yp1Var3 = (yp1) this.f25142c;
        boolean z = this.f25140a;
        yp1 yp1Var4 = this.f25144e;
        yp1 yp1Var5 = (yp1) this.f25146g;
        yp1 yp1Var6 = (yp1) this.f25147h;
        yp1 yp1Var7 = (yp1) this.f25148i;
        n41 n41Var = (n41) this.f25149j;
        o41 o41Var = new o41();
        o41Var.f26320a = str;
        o41Var.f26321b = yp1Var3;
        o41Var.f26322c = dh0Var;
        o41Var.f26323d = z;
        o41Var.f26324e = yp1Var4;
        o41Var.f26325f = yp1Var;
        o41Var.f26326g = yp1Var5;
        o41Var.f26327h = yp1Var6;
        o41Var.f26328i = yp1Var7;
        o41Var.f26329j = n41Var;
        o41Var.f26330k = new HashMap();
        VarHandle.storeStoreFence();
        return o41Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m8370b(xc3 xc3Var, ym0 ym0Var) {
        dq4 dq4Var;
        if (ym0Var instanceof dq4) {
            dq4Var = (dq4) ym0Var;
            int i = dq4Var.f17285w;
            if ((i & Integer.MIN_VALUE) != 0) {
                dq4Var.f17285w = i - Integer.MIN_VALUE;
            } else {
                dq4Var = new dq4(this, ym0Var);
            }
        } else {
            dq4Var = new dq4(this, ym0Var);
        }
        Object objMo2968a = dq4Var.f17283u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = dq4Var.f17285w;
        byte b = 2;
        if (i2 == 0) {
            k43.m7376J(objMo2968a);
            ro4 ro4Var = new ro4(b);
            dq4Var.f17282t = xc3Var;
            dq4Var.f17285w = 1;
            objMo2968a = xc3Var.mo2968a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", ro4Var, dq4Var);
            if (objMo2968a != ap0Var) {
            }
            return ap0Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) dq4Var.f17282t;
            k43.m7376J(objMo2968a);
            return set;
        }
        xc3Var = (xc3) dq4Var.f17282t;
        k43.m7376J(objMo2968a);
        Set set2 = (Set) objMo2968a;
        if (!set2.isEmpty()) {
            dq4Var.f17282t = set2;
            dq4Var.f17285w = 2;
            if (n40.m8503m(xc3Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", dq4Var) == ap0Var) {
                return ap0Var;
            }
        }
        return set2;
    }

    /* JADX INFO: renamed from: c */
    public mq4 m8371c(o41 o41Var) {
        pc0 pc0Var = pc0.f27519d;
        String str = (String) this.f25141b;
        String str2 = o41Var.f26320a;
        if (!z62.m13387o(str, str2)) {
            StringBuilder sbM13625y = zi4.m13625y("Attempting to extend color ", (String) this.f25141b, " with color ", str2, " of different name for spec version ");
            sbM13625y.append(pc0Var);
            sbM13625y.append(".");
            throw new IllegalArgumentException(sbM13625y.toString().toString());
        }
        boolean z = this.f25140a;
        boolean z2 = o41Var.f26323d;
        String str3 = (String) this.f25141b;
        if (z != z2) {
            String str4 = z ? "background" : "foreground";
            String str5 = z2 ? "background" : "foreground";
            StringBuilder sbM13625y2 = zi4.m13625y("Attempting to extend color ", str3, " as a ", str4, " with color ");
            zi4.m13599B(sbM13625y2, str2, " as a ", str5, " for spec version ");
            sbM13625y2.append(pc0Var);
            sbM13625y2.append(".");
            throw new IllegalArgumentException(sbM13625y2.toString().toString());
        }
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = str3;
        mq4Var.f25140a = z;
        n41 n41Var = new n41((byte) 0);
        n41Var.f25440b = o41Var;
        n41Var.f25441c = this;
        VarHandle.storeStoreFence();
        mq4Var.f25142c = n41Var;
        n41 n41Var2 = new n41((byte) 1);
        n41Var2.f25440b = o41Var;
        n41Var2.f25441c = this;
        VarHandle.storeStoreFence();
        mq4Var.f25143d = n41Var2;
        n41 n41Var3 = new n41((byte) 2);
        n41Var3.f25440b = o41Var;
        n41Var3.f25441c = this;
        VarHandle.storeStoreFence();
        mq4Var.f25144e = n41Var3;
        n41 n41Var4 = new n41((byte) 3);
        n41Var4.f25440b = o41Var;
        n41Var4.f25441c = this;
        VarHandle.storeStoreFence();
        mq4Var.f25145f = n41Var4;
        n41 n41Var5 = new n41((byte) 4);
        n41Var5.f25440b = o41Var;
        n41Var5.f25441c = this;
        VarHandle.storeStoreFence();
        mq4Var.f25146g = n41Var5;
        n41 n41Var6 = new n41((byte) 5);
        n41Var6.f25440b = o41Var;
        n41Var6.f25441c = this;
        VarHandle.storeStoreFence();
        mq4Var.f25147h = n41Var6;
        n41 n41Var7 = new n41((byte) 6);
        n41Var7.f25440b = o41Var;
        n41Var7.f25441c = this;
        VarHandle.storeStoreFence();
        mq4Var.f25148i = n41Var7;
        n41 n41Var8 = new n41((byte) 7);
        n41Var8.f25440b = o41Var;
        n41Var8.f25441c = this;
        VarHandle.storeStoreFence();
        mq4Var.f25149j = n41Var8;
        return mq4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public Object m8372d(ym0 ym0Var) throws Throwable {
        gq4 gq4Var;
        nh3 nh3Var;
        Object objM3077t;
        Throwable th;
        nh3 nh3Var2;
        Object value;
        int[] iArr;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f25141b;
        if (ym0Var instanceof gq4) {
            gq4Var = (gq4) ym0Var;
            int i = gq4Var.f20033x;
            if ((i & Integer.MIN_VALUE) != 0) {
                gq4Var.f20033x = i - Integer.MIN_VALUE;
            } else {
                gq4Var = new gq4(this, ym0Var);
            }
        } else {
            gq4Var = new gq4(this, ym0Var);
        }
        Object obj = gq4Var.f20031v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = gq4Var.f20033x;
        wm0 wm0Var = null;
        byte b = 0;
        if (i2 == 0) {
            k43.m7376J(obj);
            nh3Var = workDatabase_Impl.f14691f;
            boolean zM8748f = nh3Var.m8748f();
            b81 b81Var = b81.f15153a;
            if (!zM8748f) {
                return b81Var;
            }
            try {
                if (!((AtomicBoolean) this.f25148i).compareAndSet(true, false)) {
                    nh3Var.m8746M();
                    return b81Var;
                }
                if (!((Boolean) ((wp1) this.f25149j).invoke()).booleanValue()) {
                    nh3Var.m8746M();
                    return b81Var;
                }
                hq4 hq4Var = new hq4(this, wm0Var, b);
                gq4Var.f20029t = this;
                gq4Var.f20030u = nh3Var;
                gq4Var.f20033x = 1;
                objM3077t = workDatabase_Impl.m3077t(false, hq4Var, gq4Var);
                if (objM3077t == ap0Var) {
                    return ap0Var;
                }
            } catch (Throwable th2) {
                nh3 nh3Var3 = nh3Var;
                th = th2;
                nh3Var2 = nh3Var3;
                nh3Var2.m8746M();
                throw th;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nh3Var2 = gq4Var.f20030u;
            mq4 mq4Var = gq4Var.f20029t;
            try {
                k43.m7376J(obj);
                nh3Var = nh3Var2;
                this = mq4Var;
                objM3077t = obj;
            } catch (Throwable th3) {
                th = th3;
                nh3Var2.m8746M();
                throw th;
            }
        }
        Set set = (Set) objM3077t;
        if (!set.isEmpty()) {
            su0 su0Var = (su0) this.f25147h;
            su0Var.getClass();
            if (!set.isEmpty()) {
                ac4 ac4Var = su0Var.f30564a;
                do {
                    value = ac4Var.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                    }
                } while (!ac4Var.m198i(value, iArr));
            }
            ((C0633f0) this.f25144e).invoke(set);
        }
        nh3Var.m8746M();
        return set;
    }

    /* JADX INFO: renamed from: e */
    public void m8373e(wp1 wp1Var, wp1 wp1Var2) {
        if (((AtomicBoolean) this.f25148i).compareAndSet(false, true)) {
            wp1Var.invoke();
            um0 um0Var = ((WorkDatabase_Impl) this.f25141b).f14686a;
            wm0 wm0Var = null;
            if (um0Var == null) {
                z62.m13366Y("coroutineScope");
                throw null;
            }
            vo0 vo0Var = new vo0(vo0.f32759c);
            vo0Var.f32760b = "Room Invalidation Tracker Refresh";
            VarHandle.storeStoreFence();
            lb5.m7910S(um0Var, vo0Var, null, new vp4(this, wp1Var2, wm0Var, (byte) 2), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (p000.n40.m8503m(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        if (p000.n40.m8503m(r10, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00dd -> B:28:0x00e0). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8374f(cf4 cf4Var, int i, ym0 ym0Var) {
        iq4 iq4Var;
        String[] strArr;
        mq4 mq4Var;
        int i2;
        xc3 xc3Var;
        int i3;
        String str;
        String str2;
        boolean z;
        mq4 mq4Var2 = this;
        xc3 xc3Var2 = cf4Var;
        int i4 = i;
        if (ym0Var instanceof iq4) {
            iq4Var = (iq4) ym0Var;
            int i5 = iq4Var.f21645C;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iq4Var.f21645C = i5 - Integer.MIN_VALUE;
            } else {
                iq4Var = new iq4(mq4Var2, ym0Var);
            }
        } else {
            iq4Var = new iq4(mq4Var2, ym0Var);
        }
        Object obj = iq4Var.f21643A;
        ap0 ap0Var = ap0.f14763a;
        int i6 = iq4Var.f21645C;
        boolean z2 = true;
        if (i6 != 0) {
            if (i6 == 1) {
                int i7 = iq4Var.f21650x;
                xc3Var2 = iq4Var.f21647u;
                mq4 mq4Var3 = iq4Var.f21646t;
                k43.m7376J(obj);
                i4 = i7;
                mq4Var2 = mq4Var3;
            } else {
                if (i6 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = iq4Var.f21652z;
                i3 = iq4Var.f21651y;
                i4 = iq4Var.f21650x;
                strArr = iq4Var.f21649w;
                str = iq4Var.f21648v;
                xc3Var = iq4Var.f21647u;
                mq4Var = iq4Var.f21646t;
                k43.m7376J(obj);
                z = true;
            }
            i3++;
            z2 = z;
            if (i3 < i2) {
                return ju4.f22634a;
            }
            String str3 = strArr[i3];
            if (mq4Var.f25140a) {
                str2 = "TEMP";
            } else {
                str2 = "";
            }
            z = z2;
            StringBuilder sbM13625y = zi4.m13625y("CREATE ", str2, " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
            zi4.m13599B(sbM13625y, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            String strM3880l = c75.m3880l(sbM13625y, i4, " AND invalidated = 0; END");
            iq4Var.f21646t = mq4Var;
            iq4Var.f21647u = xc3Var;
            iq4Var.f21648v = str;
            iq4Var.f21649w = strArr;
            iq4Var.f21650x = i4;
            iq4Var.f21651y = i3;
            iq4Var.f21652z = i2;
            iq4Var.f21645C = 2;
        } else {
            k43.m7376J(obj);
            String str4 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i4 + ", 0)";
            iq4Var.f21646t = mq4Var2;
            iq4Var.f21647u = xc3Var2;
            iq4Var.f21650x = i4;
            iq4Var.f21645C = 1;
        }
        String str5 = ((String[]) mq4Var2.f25145f)[i4];
        strArr = f25139k;
        mq4Var = mq4Var2;
        i2 = 3;
        xc3Var = xc3Var2;
        i3 = 0;
        str = str5;
        if (i3 < i2) {
            return ju4.f22634a;
        }
        String str6 = strArr[i3];
        if (mq4Var.f25140a) {
            str2 = "TEMP";
        } else {
            str2 = "";
        }
        z = z2;
        StringBuilder sbM13625y2 = zi4.m13625y("CREATE ", str2, " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str6, "` AFTER ");
        zi4.m13599B(sbM13625y2, str6, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
        String strM3880l2 = c75.m3880l(sbM13625y2, i4, " AND invalidated = 0; END");
        iq4Var.f21646t = mq4Var;
        iq4Var.f21647u = xc3Var;
        iq4Var.f21648v = str;
        iq4Var.f21649w = strArr;
        iq4Var.f21650x = i4;
        iq4Var.f21651y = i3;
        iq4Var.f21652z = i2;
        iq4Var.f21645C = 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:19:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: g */
    public java.lang.Object m8375g(p000.cf4 r9, int r10, p000.ym0 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p000.jq4
            if (r0 == 0) goto L13
            r0 = r11
            jq4 r0 = (p000.jq4) r0
            int r1 = r0.f22520A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22520A = r1
            goto L18
        L13:
            jq4 r0 = new jq4
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f22526y
            ap0 r1 = p000.ap0.f14763a
            int r2 = r0.f22520A
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            int r8 = r0.f22525x
            int r9 = r0.f22524w
            java.lang.String[] r10 = r0.f22523v
            java.lang.String r2 = r0.f22522u
            xc3 r4 = r0.f22521t
            p000.k43.m7376J(r11)
            r11 = r10
            r10 = r4
            goto L83
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r8)
            r8 = 0
            return r8
        L3a:
            p000.k43.m7376J(r11)
            java.lang.Object r8 = r8.f25145f
            java.lang.String[] r8 = (java.lang.String[]) r8
            r8 = r8[r10]
            java.lang.String[] r10 = p000.mq4.f25139k
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L4e:
            if (r9 >= r8) goto L85
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = p000.zi4.m13617q(r6, r5, r4)
            r0.f22521t = r10
            r0.f22522u = r2
            r0.f22523v = r11
            r0.f22524w = r9
            r0.f22525x = r8
            r0.f22520A = r3
            java.lang.Object r4 = p000.n40.m8503m(r10, r4, r0)
            if (r4 != r1) goto L83
            return r1
        L83:
            int r9 = r9 + r3
            goto L4e
        L85:
            ju4 r8 = p000.ju4.f22634a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.mq4.m8375g(cf4, int, ym0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: h */
    public Object m8376h(ym0 ym0Var) throws Throwable {
        kq4 kq4Var;
        Throwable th;
        nh3 nh3Var;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f25141b;
        if (ym0Var instanceof kq4) {
            kq4Var = (kq4) ym0Var;
            int i = kq4Var.f23337w;
            if ((i & Integer.MIN_VALUE) != 0) {
                kq4Var.f23337w = i - Integer.MIN_VALUE;
            } else {
                kq4Var = new kq4(this, ym0Var);
            }
        } else {
            kq4Var = new kq4(this, ym0Var);
        }
        Object obj = kq4Var.f23335u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = kq4Var.f23337w;
        wm0 wm0Var = null;
        byte b = 1;
        if (i2 == 0) {
            k43.m7376J(obj);
            nh3 nh3Var2 = workDatabase_Impl.f14691f;
            if (nh3Var2.m8748f()) {
                try {
                    hq4 hq4Var = new hq4(this, wm0Var, b);
                    kq4Var.f23334t = nh3Var2;
                    kq4Var.f23337w = 1;
                    if (workDatabase_Impl.m3077t(false, hq4Var, kq4Var) == ap0Var) {
                        return ap0Var;
                    }
                    nh3Var = nh3Var2;
                    nh3Var.m8746M();
                } catch (Throwable th2) {
                    th = th2;
                    nh3Var = nh3Var2;
                    nh3Var.m8746M();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nh3Var = kq4Var.f23334t;
            try {
                k43.m7376J(obj);
                nh3Var.m8746M();
            } catch (Throwable th3) {
                th = th3;
                nh3Var.m8746M();
                throw th;
            }
        }
        return ju4.f22634a;
    }
}
