package hg.mori.learn.java.gold.encapsulation;
/*
 * �J�v�Z�����ɂ���
 * �t�B�[���h�̕ϐ����𒼐ڕҏW�����Ȃ���
 * ���\�b�h����̃R���g���[�����������Ȃ��C���[�W
 */
public class TestBean {
	
	// �t�B�[���h�ϐ���private�錾
	private String name;
	private int id;
	
	// �O������A�N�Z�X�����郁�\�b�h
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int Id) {
		this.id = id;
	}

}
