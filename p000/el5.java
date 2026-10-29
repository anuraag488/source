package p000;

import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class el5 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18241a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f18241a) {
            case 0:
                ((y75) obj).mo1975b();
                break;
            case 1:
                ((y75) obj).onStop();
                break;
            case 2:
                ((y75) obj).onPause();
                break;
            case 3:
                ((y75) obj).a$3();
                break;
            case 4:
                ((y75) obj).mo1976c();
                break;
            case 5:
                ((y75) obj).onResume();
                break;
            case 6:
                ((y75) obj).mo1977g();
                break;
            default:
                ((y75) obj).onDestroy();
                break;
        }
    }
}
