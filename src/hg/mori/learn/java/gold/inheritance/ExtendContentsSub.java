package hg.mori.learn.java.gold.inheritance;

/*
 * �p���ł�����e�ɂ���(�q�N���X)
 * ���(�t�B�[���h) �� �Z
 * �U�镑��(���\�b�h) �� �Z
 * �����N���X �� �~
 * �C���^�t�F�[�X �� �~
 * �񋓌^ �� �~
 * 
 * private�͌p������Ȃ��A�T�O�I�ȈӖ��ł͐F�X�ȉ��߂�����炵����
 * ���Ȃ��Ƃ����̂܂܎g�p���鎖�͏o���Ȃ��B
 */
public class ExtendContentsSub extends ExtendContentsParent {
	String tanaka = super.name; 
	String yamada = getName();
}
