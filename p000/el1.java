package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class el1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18199a;

    public /* synthetic */ el1(byte b) {
        this.f18199a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        gx1 gx1Var;
        Context context = null;
        byte b = 0;
        z = false;
        boolean z = false;
        byte b2 = 1;
        switch (this.f18199a) {
            case 0:
                return ju4.f22634a;
            case 1:
                throw zi4.m13616p(obj);
            case 2:
                synchronized (k94.f23012c) {
                    List list = k94.f23018i;
                    int size = list.size();
                    while (b < size) {
                        ((yp1) list.get(b)).invoke(obj);
                        b++;
                    }
                }
                return ju4.f22634a;
            case 3:
                ((kz3) obj).m7753a(null, y70.f34986q);
                return ju4.f22634a;
            case 4:
                ((lx1) obj).getClass();
                return Boolean.TRUE;
            case 5:
                o14.m8923d((q14) obj, 0);
                return ju4.f22634a;
            case 6:
                o14.m8923d((q14) obj, 1);
                return ju4.f22634a;
            case 7:
                o14.m8923d((q14) obj, 1);
                return ju4.f22634a;
            case 8:
                f12 f12Var = (f12) obj;
                List listM11675a = uw4.m11675a("M12,12m-6,0a6,6 0,1 1,12 0a6,6 0,1 1,-12 0");
                long j = pb0.f27497d;
                f12.m5445c(f12Var, listM11675a, new ga4(j), 0.4f, 0.0f, 0, 0.0f, 16358);
                f12.m5445c(f12Var, uw4.m11675a("M12,12m-3,0a3,3 0,1 1,6 0a3,3 0,1 1,-6 0"), new ga4(j), 0.0f, 0.0f, 0, 0.0f, 16374);
                return ju4.f22634a;
            case 9:
                return ju4.f22634a;
            case 10:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 11:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 12:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 13:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 14:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 15:
                char cCharValue2 = ((Character) obj).charValue();
                if ('0' <= cCharValue2 && cCharValue2 < ':') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                s90 s90Var = (s90) obj;
                s90.m10563a(s90Var, "JsonPrimitive", zt5.m13787s(new fj0((byte) 28)));
                s90.m10563a(s90Var, "JsonNull", zt5.m13787s(new fj0((byte) 29)));
                s90.m10563a(s90Var, "JsonLiteral", zt5.m13787s(new da2(b)));
                s90.m10563a(s90Var, "JsonObject", zt5.m13787s(new da2(b2)));
                s90.m10563a(s90Var, "JsonArray", zt5.m13787s(new da2((byte) 2)));
                return ju4.f22634a;
            case 17:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                aa2 aa2Var = (aa2) entry.getValue();
                StringBuilder sb = new StringBuilder();
                ed4.m5092a(str, sb);
                sb.append(':');
                sb.append(aa2Var);
                return sb.toString();
            case 18:
                ((Integer) obj).getClass();
                return null;
            case 19:
                return ju4.f22634a;
            case 20:
                List list2 = (List) obj;
                return new si2(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 21:
                return ju4.f22634a;
            case 22:
                return ju4.f22634a;
            case 23:
                return ju4.f22634a;
            case 24:
                return ju4.f22634a;
            case 25:
                for (Context baseContext = (Context) ((aj0) obj).mo2998b(AndroidCompositionLocals_androidKt.f14651b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof Activity) {
                        context = baseContext;
                        return (Activity) context;
                    }
                }
                return (Activity) context;
            case 26:
                fb3 fb3Var = (fb3) obj;
                if (fb3Var.mo3599F()) {
                    so2 so2Var = fb3Var.f18893b;
                    if (!so2Var.f30441o) {
                        yp1 yp1VarMo4505e = fb3Var.f18892a.mo4505e();
                        if (fb3Var.f18892a.mo5704c() != null) {
                            so2Var.m10883M0();
                        } else if (yp1VarMo4505e == null) {
                            so2Var.f30434h = null;
                            so2Var.f30435i = null;
                            so2Var.f30433g = null;
                            so2Var.m10883M0();
                        } else {
                            so2Var.f30434h = null;
                            so2Var.f30435i = null;
                            so2Var.m10885v0(fb3Var, 9223372034707292159L, 0L);
                            so2Var.f30433g = yp1VarMo4505e;
                        }
                    }
                }
                return ju4.f22634a;
            case 27:
                fb3 fb3Var2 = (fb3) obj;
                if (fb3Var2.mo3599F() && (gx1Var = fb3Var2.f18894c) != null) {
                    so2 so2Var2 = fb3Var2.f18893b;
                    lw2 lw2Var = so2Var2.f30444r;
                    mw2 mw2Var = lw2Var != null ? (mw2) lw2Var.m8132g(gx1Var) : null;
                    if (mw2Var != null) {
                        x72 x72Var = so2Var2.f30443q;
                        if (x72Var != null) {
                            x72Var.m12524k(gx1Var);
                        }
                        so2Var2.m10882K0(mw2Var);
                        mw2Var.m8410b();
                    }
                }
                return ju4.f22634a;
            case 28:
                ((wf2) obj).f33318h = true;
                return ju4.f22634a;
            default:
                ((Long) obj).getClass();
                return ju4.f22634a;
        }
    }
}
