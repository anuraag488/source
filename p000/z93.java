package p000;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z93 implements u93 {

    /* JADX INFO: renamed from: a */
    public d83 f35881a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f35882b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f35883c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ g12 f35884d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ mq1 f35885e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ wp1 f35886f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ mq1 f35887g;

    @Override // p000.InterfaceC1347xx
    /* JADX INFO: renamed from: a */
    public final Boolean mo11770a() {
        return (Boolean) this.f35881a.getValue();
    }

    @Override // p000.u93
    /* JADX INFO: renamed from: b */
    public final mq1 mo11304b() {
        return this.f35885e;
    }

    @Override // p000.InterfaceC1347xx
    /* JADX INFO: renamed from: c */
    public final Object mo11771c(wm0 wm0Var) {
        return this.f35887g.invoke(Collections.singletonList(this), wm0Var);
    }

    @Override // p000.InterfaceC1347xx
    /* JADX INFO: renamed from: d */
    public final Object mo12534d(of4 of4Var) {
        this.f35881a.setValue((Boolean) this.f35886f.invoke());
        return ju4.f22634a;
    }

    @Override // p000.u93
    public final String getDescription() {
        return this.f35883c;
    }

    @Override // p000.u93
    public final g12 getIcon() {
        return this.f35884d;
    }

    @Override // p000.u93
    public final String getTitle() {
        return this.f35882b;
    }

    public final String toString() {
        return "Permission(title=" + this.f35882b + ", status=" + mo11770a() + ")";
    }
}
