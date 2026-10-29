package p000;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mt0 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25186a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ru0 f25187b;

    public /* synthetic */ mt0(byte b) {
        this.f25186a = b;
    }

    @Override // p000.wp1
    public final Object invoke() throws IOException {
        byte b = this.f25186a;
        ru0 ru0Var = this.f25187b;
        switch (b) {
            case 0:
                cf1 cf1Var = ru0Var.f29625a;
                File canonicalFile = ((File) cf1Var.f15979c.invoke()).getCanonicalFile();
                synchronized (cf1.f15976e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = cf1.f15975d;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(absolutePath);
                }
                t24 t24Var = cf1Var.f15977a;
                c74 c74Var = (c74) cf1Var.f15978b.invoke(canonicalFile);
                C1053q c1053q = new C1053q((byte) 26);
                c1053q.f28113b = canonicalFile;
                VarHandle.storeStoreFence();
                ff1 ff1Var = new ff1();
                ff1Var.f18942a = canonicalFile;
                ff1Var.f18943b = t24Var;
                ff1Var.f18944c = c74Var;
                ff1Var.f18945d = c1053q;
                ff1Var.f18946e = new AtomicBoolean(false);
                ff1Var.f18947f = hx2.m6530a();
                VarHandle.storeStoreFence();
                return ff1Var;
            default:
                return ((ff1) ru0Var.f29634j.getValue()).f18944c;
        }
    }
}
