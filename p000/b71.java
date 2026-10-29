package p000;

import android.view.MotionEvent;
import essentials.accessibility.EsAccessibilityService;
import essentials.app.EsApp;
import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b71 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15140a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f15141b;

    public /* synthetic */ b71(byte b) {
        this.f15140a = b;
    }

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
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        String strConcat;
        int length;
        int i;
        String str;
        mi2 mi2Var;
        byte b = this.f15140a;
        float f = 0.0f;
        int i2 = 0;
        mi2 mi2Var2 = null;
        boolean z = true;
        Object obj2 = this.f15141b;
        switch (b) {
            case 0:
                a71 a71Var = (a71) obj;
                String str2 = ((a71) obj2) == a71Var ? " > " : "   ";
                if (!(a71Var instanceof xd0)) {
                    if (a71Var instanceof v34) {
                        v34 v34Var = (v34) a71Var;
                        length = v34Var.f32359a.f24092b.length();
                        i = v34Var.f32360b;
                        str = "SetComposingTextCommand(text.length=";
                    } else if (a71Var instanceof u34) {
                        strConcat = ((u34) a71Var).toString();
                    } else if (a71Var instanceof ey0) {
                        strConcat = ((ey0) a71Var).toString();
                    } else if (a71Var instanceof fy0) {
                        strConcat = ((fy0) a71Var).toString();
                    } else if (a71Var instanceof w34) {
                        strConcat = ((w34) a71Var).toString();
                    } else if (a71Var instanceof zf1) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (a71Var instanceof dy0) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strM10249b = rl3.m10361a(a71Var.getClass()).m10249b();
                        if (strM10249b == null) {
                            strM10249b = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strM10249b);
                    }
                    return str2.concat(strConcat);
                }
                xd0 xd0Var = (xd0) a71Var;
                length = xd0Var.f34166a.f24092b.length();
                i = xd0Var.f34167b;
                str = "CommitTextCommand(text.length=";
                strConcat = d55.m4367l(str, length, ", newCursorPosition=", i, ")");
                return str2.concat(strConcat);
            case 1:
                EsAccessibilityService esAccessibilityService = (EsAccessibilityService) obj2;
                xn2 xn2Var = esAccessibilityService.f18446c;
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, "service started", null);
                    }
                }
                C1032pf c1032pf = new C1032pf((byte) 5);
                c1032pf.f27570b = esAccessibilityService;
                VarHandle.storeStoreFence();
                return c1032pf;
            case 2:
                int i3 = EsApp.f18450c;
                C0928n c0928n = new C0928n((byte) 8);
                c0928n.f25353b = (C0459am) obj2;
                VarHandle.storeStoreFence();
                oi2.m9121c((vg2) obj, null, new pg0(1233337316, true, c0928n), 3);
                return ju4.f22634a;
            case 3:
                uw2 uw2Var = (uw2) obj2;
                Object[] objArr = uw2Var.f32211a;
                int i4 = uw2Var.f32213c;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((yq2) objArr[i5]).mo4503b();
                }
                return ju4.f22634a;
            case 4:
                fs4 fs4Var = (fs4) obj;
                return ((cm1) obj2).m4043a(new fs4(null, fs4Var.f19250b, fs4Var.f19251c, fs4Var.f19252d, fs4Var.f19253e)).getValue();
            case 5:
                f40 f40Var = (f40) obj2;
                ju4 ju4Var = ju4.f22634a;
                if (ss1.f30543b.compareAndSet(false, true)) {
                    f40Var.mo5493n(ju4Var);
                }
                return ju4Var;
            case 6:
                kz3 kz3Var = (kz3) obj;
                for (Object obj3 : (List) obj2) {
                    cx0 cx0Var = new cx0(z ? 1 : 0);
                    cx0Var.f16562b = obj3;
                    VarHandle.storeStoreFence();
                    kz3Var.m7753a(null, new pg0(-1568955183, true, cx0Var));
                }
                return ju4.f22634a;
            case 7:
                u31 u31Var = (u31) obj;
                h70 h70VarM7248w = u31Var.mo7035J().m7248w();
                mq1 mq1Var = ((du1) obj2).f17393d;
                if (mq1Var != null) {
                    mq1Var.invoke(h70VarM7248w, (bu1) u31Var.mo7035J().f22482c);
                }
                return ju4.f22634a;
            case 8:
                iu1 iu1Var = (iu1) obj2;
                jw4 jw4Var = (jw4) obj;
                iu1Var.m6939g(jw4Var);
                yp1 yp1Var = iu1Var.f21793i;
                if (yp1Var != null) {
                    yp1Var.invoke(jw4Var);
                }
                return ju4.f22634a;
            case 9:
                hw2 hw2Var = (hw2) obj;
                ((zv1) obj2).getClass();
                xd3 xd3Var = zv1.f36408c;
                long j = 0;
                for (Map.Entry entry : hw2Var.m6523a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        xd3 xd3Var2 = (xd3) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strM13802b = zv1.m13802b(System.currentTimeMillis());
                        if (set.contains(strM13802b)) {
                            hw2Var.m6527e(xd3Var2, Set.of(strM13802b));
                            j++;
                        } else {
                            hw2Var.m6526d(xd3Var2);
                        }
                    }
                }
                if (j == 0) {
                    hw2Var.m6526d(xd3Var);
                } else {
                    hw2Var.m6527e(xd3Var, Long.valueOf(j));
                }
                return null;
            case 10:
                a42 a42Var = (a42) obj2;
                f23 f23Var = (f23) obj;
                gl3 gl3Var = f23Var.f18674b;
                if (gl3Var != null) {
                    gl3Var.closeConnection();
                    f23Var.f18674b = null;
                }
                uw2 uw2Var2 = a42Var.f98d;
                Object[] objArr2 = uw2Var2.f32211a;
                int i6 = uw2Var2.f32213c;
                while (true) {
                    if (i2 >= i6) {
                        i2 = -1;
                    } else if (!z62.m13387o((ez4) objArr2[i2], f23Var)) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    uw2Var2.m11672l(i2);
                }
                if (uw2Var2.f32213c == 0) {
                    a42Var.f96b.invoke();
                }
                return ju4.f22634a;
            case 11:
                C1032pf c1032pf2 = new C1032pf((byte) 9);
                c1032pf2.f27570b = (kh2) obj2;
                VarHandle.storeStoreFence();
                return c1032pf2;
            case 12:
                C1032pf c1032pf3 = new C1032pf((byte) 11);
                c1032pf3.f27570b = (qh2) obj2;
                VarHandle.storeStoreFence();
                return c1032pf3;
            case 13:
                ((Integer) obj).getClass();
                return obj2;
            case 14:
                si2 si2Var = (si2) obj2;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || si2Var.mo6020c()) && (f2 <= 0.0f || si2Var.mo6018a())) {
                    if (Math.abs(si2Var.f30302h) > 0.5f) {
                        t32.m10970c("entered drag with non-zero pending scroll");
                    }
                    si2Var.f30298d = true;
                    float f3 = si2Var.f30302h + f2;
                    si2Var.f30302h = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = si2Var.f30302h;
                        int iRound = Math.round(f4);
                        mi2 mi2VarM8332h = ((mi2) si2Var.f30300f.getValue()).m8332h(iRound, !si2Var.f30296b);
                        if (mi2VarM8332h == null || (mi2Var = si2Var.f30297c) == null) {
                            mi2Var2 = mi2VarM8332h;
                        } else {
                            mi2 mi2VarM8332h2 = mi2Var.m8332h(iRound, true);
                            if (mi2VarM8332h2 != null) {
                                si2Var.f30297c = mi2VarM8332h2;
                                mi2Var2 = mi2VarM8332h;
                            }
                        }
                        if (mi2Var2 != null) {
                            si2Var.m10787f(mi2Var2, si2Var.f30296b, true);
                            si2Var.f30316v.setValue(ju4.f22634a);
                            si2Var.m10790i(f4 - si2Var.f30302h, mi2Var2);
                        } else {
                            wf2 wf2Var = si2Var.f30305k;
                            if (wf2Var != null) {
                                wf2Var.m12285l();
                            }
                            si2Var.m10790i(f4 - si2Var.f30302h, si2Var.m10789h());
                        }
                    }
                    if (Math.abs(si2Var.f30302h) > 0.5f) {
                        f2 -= si2Var.f30302h;
                        si2Var.f30302h = 0.0f;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 15:
                lu3 lu3Var = (lu3) obj2;
                return Boolean.valueOf(lu3Var != null ? lu3Var.mo8110b(obj) : true);
            case 16:
                return ((iq2) obj2).m6851b(((Integer) obj).intValue());
            case 17:
                ((gx2) obj2).m6193g(null);
                return ju4.f22634a;
            case 18:
                ((kz2) obj2).f23632a.setValue((nz2) obj);
                return ju4.f22634a;
            case 19:
                return Boolean.valueOf(((a03) obj).f19b == ((uu2) obj2));
            case 20:
                ((cw2) obj2).m4200a((lt2) obj);
                return Boolean.TRUE;
            case 21:
                g24 g24Var = (g24) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return g24Var.mo4433e(iIntValue) + ": " + g24Var.mo4436j(iIntValue).mo3641b();
            case 22:
                ((C1256vh) ((rc3) obj2).m10293c()).invoke((MotionEvent) obj);
                return ju4.f22634a;
            case 23:
                ((zi0) obj2).mo13322k(obj);
                return ju4.f22634a;
            case 24:
                el3 el3Var = (el3) obj2;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (el3Var.f18216c) {
                    try {
                        t82 t82Var = el3Var.f18217d;
                        if (t82Var != null) {
                            ac4 ac4Var = el3Var.f18234u;
                            cl3 cl3Var = cl3.f16100b;
                            ac4Var.getClass();
                            ac4Var.m200k(null, cl3Var);
                            t82Var.mo4993a(cancellationException);
                            el3Var.f18231r = null;
                            na1 na1Var = new na1((byte) 24);
                            na1Var.f25595b = el3Var;
                            na1Var.f25596c = th;
                            VarHandle.storeStoreFence();
                            t82Var.mo4972C(na1Var);
                        } else {
                            el3Var.f18218e = cancellationException;
                            ac4 ac4Var2 = el3Var.f18234u;
                            cl3 cl3Var2 = cl3.f16099a;
                            ac4Var2.getClass();
                            ac4Var2.m200k(null, cl3Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return ju4.f22634a;
            case 25:
                ((gl3) obj2).m6033a((a71) obj);
                return ju4.f22634a;
            case 26:
                ((C1122rv) obj2).f29655f = (uo1) obj;
                return ju4.f22634a;
            case 27:
                ((y94) obj2).remove(obj);
                return ju4.f22634a;
            case 28:
                wx3 wx3Var = (wx3) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                a83 a83Var = wx3Var.f33828a;
                float fM132h = a83Var.m132h() + fFloatValue + wx3Var.f33834g;
                float fM10674o = sc6.m10674o(fM132h, 0.0f, wx3Var.f33833f.m132h());
                byte b2 = fM132h == fM10674o ? (byte) 1 : (byte) 0;
                float fM132h2 = fM10674o - a83Var.m132h();
                int iRound2 = Math.round(fM132h2);
                a83Var.m133i(a83Var.m132h() + iRound2);
                wx3Var.f33834g = fM132h2 - iRound2;
                if (b2 == 0) {
                    fFloatValue = fM132h2;
                }
                return Float.valueOf(fFloatValue);
            default:
                vy3 vy3Var = (vy3) obj2;
                return b33.m3423a(vy3Var.m12031d(vy3Var.f32968k, ((b33) obj).f15059a, vy3Var.f32967j));
        }
    }
}
