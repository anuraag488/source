package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oq2 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f26960a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ js4 f26961b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ mq1 f26962c;

    public /* synthetic */ oq2(byte b) {
        this.f26960a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26960a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 1;
        switch (b) {
            case 0:
                js4 js4Var = this.f26961b;
                mq1 mq1Var = this.f26962c;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    oq2 oq2Var = new oq2(b2);
                    oq2Var.f26961b = js4Var;
                    oq2Var.f26962c = mq1Var;
                    VarHandle.storeStoreFence();
                    id3.m6765a(vd6.m11834R(-241536773, oq2Var, ir1Var), ir1Var, 6);
                }
                break;
            default:
                js4 js4Var2 = this.f26961b;
                mq1 mq1Var2 = this.f26962c;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    gl4.m6036a(js4Var2.f22579j, mq1Var2, ir1Var2, 0);
                }
                break;
        }
        return ju4Var;
    }
}
