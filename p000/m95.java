package p000;

import ads_mobile_sdk.C0313rh;
import ads_mobile_sdk.i01;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m95 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24772a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ i01 f24773b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ x34 f24774c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f24775d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ long f24776e;

    public /* synthetic */ m95(byte b) {
        this.f24772a = b;
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
    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.f24772a) {
            case 0:
                i01 i01Var = this.f24773b;
                x34 x34Var = this.f24774c;
                int i = this.f24775d;
                long j = this.f24776e;
                yt2 yt2Var = i01Var.f4718c;
                m95 m95Var = new m95(b);
                m95Var.f24773b = i01Var;
                m95Var.f24774c = x34Var;
                m95Var.f24775d = i;
                m95Var.f24776e = j;
                VarHandle.storeStoreFence();
                yt2Var.execute(m95Var);
                break;
            default:
                i01 i01Var2 = this.f24773b;
                x34 x34Var2 = this.f24774c;
                int i2 = this.f24775d;
                long j2 = this.f24776e;
                Context context = i01Var2.f4716a;
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    xy4 xy4Var = i01Var2.f4721f;
                    String packageName = context.getPackageName();
                    String string = Integer.toString(packageInfo.versionCode);
                    xy4Var.getClass();
                    C0313rh c0313rhM12777c = xy4.m12777c(context, packageName, string);
                    if (!c0313rhM12777c.m2167B() || c0313rhM12777c.m2186x() != 32768) {
                        x34Var2.m6986m(c0313rhM12777c);
                    }
                    break;
                } catch (Throwable unused) {
                }
                if (i2 >= 3) {
                    x34Var2.m6986m(null);
                } else {
                    i01Var2.m1249a(x34Var2, i2 + 1, i2 == 1 ? 100L : j2 * 2);
                }
                break;
        }
    }
}
