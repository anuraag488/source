package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h06 extends h26 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f20250e = 0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f20251f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f20252g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f20253h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h06(zs5 zs5Var, Activity activity, zw5 zw5Var) {
        super((x36) zs5Var.f36348b, true);
        this.f20253h = activity;
        this.f20251f = zw5Var;
        this.f20252g = zs5Var;
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
    @Override // p000.h26
    /* JADX INFO: renamed from: a */
    public final void mo3419a() {
        Boolean boolValueOf;
        Bundle bundle = null;
        gx5 gx5VarAsInterface = null;
        switch (this.f20250e) {
            case 0:
                try {
                    Context context = (Context) this.f20253h;
                    y42.m12854a0(context);
                    String strM9440a = p96.m9440a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strM9440a)) {
                        strM9440a = p96.m9440a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strM9440a);
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    x36 x36Var = (x36) this.f20252g;
                    try {
                        gx5VarAsInterface = ex5.asInterface(e51.m4927c(context, (boolValueOf == null || !boolValueOf.booleanValue()) != false ? e51.f17694d : e51.f17693c, ModuleDescriptor.MODULE_ID).m4933b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (a51 e) {
                        x36Var.m12479d(e, true, false);
                    }
                    x36Var.f33967g = gx5VarAsInterface;
                    if (x36Var.f33967g != null) {
                        int iM4926a = e51.m4926a(context, ModuleDescriptor.MODULE_ID);
                        int iM4928d = e51.m4928d(context, ModuleDescriptor.MODULE_ID, false);
                        mz5 mz5Var = new mz5(130000L, Math.max(iM4926a, iM4928d), Boolean.TRUE.equals(boolValueOf) || iM4928d < iM4926a, (Bundle) this.f20251f, p96.m9440a(context));
                        gx5 gx5Var = x36Var.f33967g;
                        y42.m12854a0(gx5Var);
                        gx5Var.initialize(v23.m11711K(context), mz5Var, this.f20287a);
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((x36) this.f20252g).m12479d(e2, true, false);
                    return;
                }
                break;
            case 1:
                gx5 gx5Var2 = ((x36) this.f20252g).f33967g;
                y42.m12854a0(gx5Var2);
                gx5Var2.performAction((Bundle) this.f20251f, (zw5) this.f20253h, this.f20287a);
                break;
            case 2:
                gx5 gx5Var3 = ((x36) this.f20252g).f33967g;
                y42.m12854a0(gx5Var3);
                gx5Var3.getMaxUserProperties((String) this.f20253h, (zw5) this.f20251f);
                break;
            case 3:
                Bundle bundle2 = (Bundle) this.f20251f;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                gx5 gx5Var4 = ((x36) ((zs5) this.f20252g).f36348b).f33967g;
                y42.m12854a0(gx5Var4);
                gx5Var4.onActivityCreatedByScionActivityInfo(pz5.m9692a((Activity) this.f20253h), bundle, this.f20288b);
                break;
            default:
                gx5 gx5Var5 = ((x36) ((zs5) this.f20252g).f36348b).f33967g;
                y42.m12854a0(gx5Var5);
                gx5Var5.onActivitySaveInstanceStateByScionActivityInfo(pz5.m9692a((Activity) this.f20253h), (zw5) this.f20251f, this.f20288b);
                break;
        }
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: b */
    public void mo6202b() {
        switch (this.f20250e) {
            case 1:
                ((zw5) this.f20253h).mo7338h(null);
                break;
            case 2:
                ((zw5) this.f20251f).mo7338h(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h06(zs5 zs5Var, Bundle bundle, Activity activity) {
        super((x36) zs5Var.f36348b, true);
        this.f20251f = bundle;
        this.f20253h = activity;
        this.f20252g = zs5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h06(x36 x36Var, Context context, Bundle bundle) {
        super(x36Var, true);
        this.f20253h = context;
        this.f20251f = bundle;
        this.f20252g = x36Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h06(x36 x36Var, Bundle bundle, zw5 zw5Var) {
        super(x36Var, true);
        this.f20251f = bundle;
        this.f20253h = zw5Var;
        Objects.requireNonNull(x36Var);
        this.f20252g = x36Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h06(x36 x36Var, String str, zw5 zw5Var) {
        super(x36Var, true);
        this.f20253h = str;
        this.f20251f = zw5Var;
        Objects.requireNonNull(x36Var);
        this.f20252g = x36Var;
    }
}
