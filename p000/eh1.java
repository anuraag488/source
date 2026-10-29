package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends ue2 implements wp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f18087i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Context f18088j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh1(Context context, byte b) {
        super(0);
        this.f18087i = b;
        this.f18088j = context;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f18087i;
        Context context = this.f18088j;
        switch (b) {
            case 0:
                return C0638f5.m5541l(context, x24.f33947b.concat(".preferences_pb"));
            default:
                return C0638f5.m5541l(context, x24.f33946a.concat(".preferences_pb"));
        }
    }
}
